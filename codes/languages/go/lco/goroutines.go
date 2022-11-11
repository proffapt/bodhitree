package main

import (
	"fmt"
	"time"
)

// Concurrency v/s Parallelism
/*
	Concurrency - Doing one task at a particular moment of time but constantly switching to others, thus appearing to do multiple tasks.
	Parallelism - Doing multiple tasks at a particular meoment of time, actually doing multiple tasks.
*/

// Do NOT communicate by sharing memory; Instead
// share memory by communicating.

func main() {
	go greeter("proffapt")
	greeter("Welcome! ")
	// You will only see numbers.
	// Because you did fire up a goroutine (comparable to thread, but lightweight) - using the go keyword
	// But we never waited for the output to come back - without time.Sleep()
}

func greeter(s string){
	for i:=0; i<5; i++ {
		time.Sleep(2*time.Millisecond) // not the best way!
		fmt.Println(s)
	}
}
