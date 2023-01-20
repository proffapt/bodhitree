package main

// Mutex
/*
	Stands for Mutual Exclusion locks
	When multiple goroutines try to access same memory, we have to ensure only one and only one
	accesses at a given time, hence we create locks.. so when one goroutine is accessing the memory
	others can't do so to prevent race conditions -> which can be tested in go via `go run --race main.go`

	~> zero value for a mutex means UNLOCKED MUTEX
*/

import (
	"fmt"
	"net/http"
	"sync"
)

var wg sync.WaitGroup
var mut sync.Mutex

/*
	Generally you create a pointer variable because you actually pass these waitgruops and mutexes into functions
	But for the sake of simplicity let's just use them in functions directly and not as arguments
*/

var responses []int

func main() {
	websites := []string{"https://proffapt.me", "https://go.dev", "https://google.com", "https://duckduckgo.com", "https://github.com"}
	for _, site := range websites {
		go getStatusCode(site)
		wg.Add(1)
	}
	wg.Wait() // wait at this position exactly - jab tak sab aa nahi jate tab tak yahi ruk!
	fmt.Println(responses)
}

func getStatusCode(site string) {
	defer wg.Done()
	if response, err := http.Get(site); err != nil {
		fmt.Println("OOPS error in", site)
	} else {
		mut.Lock()
		responses = append(responses, response.StatusCode)
		mut.Unlock()
		fmt.Println(response.StatusCode, "status code for", site)
	}
}
