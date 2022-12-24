// Race Condition
/*
	When multiple goroutines try to access same chunk of memory.

	Without mutexes the `go run --race main.go` results in an exit status of 66
	This condition is called Race Condition
*/

package main

import (
	"fmt"
	"sync"
)

// RWMutex - Read Write Mutex
/*
	* Lock() - Unlock()
		- Exactly similar to that fo normal Mutexes - Only one goroutine; Only one operation (Read/Write) at a time.
		- Can be applied to Read and Write operations - If one goroutine READS no other can READ/WRITE; if one goroutine WRITES no other can READ/WRITE

	* RLock() - RUnlock()
		- As the name suggests, Applied to READING operations ONLY
		- Allows multiple goroutines to read from a memory, fun comes when a goroutine tries to write into a locked memory
		- If one or more goroutines were reading from a memory - another goroutine comes and demands to write into it -
		  RWMutex will kick the reading goroutines and allow the writer (only one at a time, order decided by goroutine schedular) to write into that memory
		  And while this is happening no other goroutine can write into that memory. And then only can the readers read the memory.
*/

var score []int

func main() {
	// Using pointers since we gonna pass their reference in multiple functions
	mut := &sync.RWMutex{} // This is the assignment way of getting a mutex or waitgroup (in the next line) earlier method was via declaration
	// Declration method: var mut *sync.RWMutex
	wg := &sync.WaitGroup{}
	//                   ^^ These are used to make sync.WaitGroup into an expression from type
	// sync.WaitGroup (type) -> sync.WaitGroup{} (expression)

	wg.Add(4)
	go func(w *sync.WaitGroup, m *sync.RWMutex) {
		// wg.Add(1)
		defer wg.Done()
		fmt.Println("Add One")
		m.Lock()
		score = append(score, 1)
		m.Unlock()
	}(wg, mut)
	go func(w *sync.WaitGroup, m *sync.RWMutex) {
		// wg.Add(1)
		defer wg.Done()
		fmt.Println("Add Two")
		m.Lock()
		score = append(score, 2)
		m.Unlock()
	}(wg, mut)
	go func(w *sync.WaitGroup, m *sync.RWMutex) {
		// wg.Add(1)
		defer wg.Done()
		fmt.Println("Add Three")
		m.Lock()
		score = append(score, 3)
		m.Unlock()
	}(wg, mut)
	go func(w *sync.WaitGroup, m *sync.RWMutex) {
		// wg.Add(1)
		defer wg.Done()
		fmt.Println("Add Three")
		m.RLock()
		fmt.Println(score)
		m.RUnlock()
	}(wg, mut)

	wg.Wait() // Execution of main function stops at this point till all goroutines return
	fmt.Println(score)
}
