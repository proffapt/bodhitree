package main

import (
	"fmt"
	"net/http"
	"sync"
)

var wg sync.WaitGroup

/*
	Generally you create a pointer variable because you actually pass these waitgruops into functions
	But for the sake of simplicity let's just use them in functions directly and not as arguments
*/

func main() {
	defer wg.Wait()
	/*
		Bruhh (to main methods), my bois aren't done yet; you just wait till all of them are done (Until I recieve a Done call from all of them)
	*/
	websites := []string{"https://proffapt.me", "https://go.dev", "https://google.com", "https://duckduckgo.com", "https://github.com"}
	// wg.Add(5)
	/*
		wg.Wait() our 5 bois are out there doing there job.
	*/
	for _, site := range websites {
		go getStatusCode(site)
		wg.Add(1) // -> This will also work.. will keep on increasing the waiting list (analogy not exactly)
	}
}

func getStatusCode(site string) {
	defer wg.Done()
	/*
		Ayo, wg.Wait() I am done with my work.
	*/
	if response, err := http.Get(site); err != nil {
		fmt.Println("OOPS error in", site)
	} else {
		fmt.Println(response.StatusCode, "status code for", site)
	}
}
