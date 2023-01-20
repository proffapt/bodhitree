package main

import (
	"fmt"
	"time"
)

// Concurrency v/s Parallelism
/*
	Concurrency - Doing one task at a particular moment of time but constantly switching to others, thus appearing to do multiple tasks.
		* You were eating your food - saw insta notif, stopped eating food started to check insta - then felt hot, dropped the phone, turned on the AC.
	Parallelism - Doing multiple tasks at a particular meoment of time, actually doing multiple tasks.
		* You were eating your food - saw insta notif, now using phone with one hand and eating food with the other - then felt hot, with food in your mouth and phone in one hand went to turn the AC on.

	*NOTE
		- Concurrency and Parallelism are almost same in Go. That's the power of Go.
		- Coroutines in Go are executed in parallel unless you set number of CPUs to 1. That's why they're called goroutines not coroutines.
			* CPU = 1 -> Concurrency (You don't have much resources for parallelism)
			* CPU > 1 -> Parallelism (You have enough resources for parallelism)
*/

// Threads v/s Goroutines
/*
	Threads:							Goroutines:
		* Managed by OS						* Managed by Go Runtime
		* At least 1MB in size (fixed)		* At least of 2KB in size (resizable)

	In golang more control is within Go Runtime for the creation of goroutines.

*/

// Motto of Golang
/*
	******* Do NOT communicate by sharing memory; Instead ********
	~> I don't know much in detail but this is what I interpreted for now --
	You have a shared memory which mulitple threads are writing / modifying upon -> when thread1 does the change now thread2 can see it.. and this is how the communicated. So basically they communicated by sharing memory.
	This can easily lead to race conditions - and to prevent this in this ideology we have mutexes.

	******* share memory by communicating *******
	~> Can explain this bit since I have experienced this in golang --
	So basically say goroutine one modifies a slice at memory 0x902835344 -> It sends this memory (reference) of the variable to another goroutine, goroutine2 via a channel and carries on it's work - goroutine2 can now see the changes made by groutine1 and can also modify it if needed. So here you SHARED MEMORY (the pointer to the variable) by COMMUNICATING.
	By this ideology you get rid of race conditions (multiple threads/goroutines trying to write on single memory address)


	===> Tho, you can do both of the things in golang but, Using the second one is the real GOLANG way!
*/

func main() {
	go greeter("proffapt") // `go` keyword is to start the following further statement in a goroutine
	greeter("Welcome! ")
	// You will only see Welcome - without time.Sleep.....
	// Because you did fire up a goroutine (comparable to thread, but lightweight) - using the go keyword
	// And since main method exits when all the methods / statements are fired up - the goroutine with greeter() was indeed fired up
	// But you never waited for it to come back - without time.Sleep() - before the goroutine could come back the main method ended.
}

func greeter(s string) {
	for i := 0; i < 5; i++ {
		time.Sleep(1 * time.Millisecond) // -> not the best way!
		// Like literally you are hardcoding the waiting time for the goroutine to come back with the result ¯\_(ツ)_/¯
		fmt.Println(s)
	}
}
