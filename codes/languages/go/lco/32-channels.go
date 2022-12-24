package main

import (
	"fmt"
	"sync"
)

// Channels
/*
	Channels are a way in which your goroutines can talk / share information with each other
	USE CASE:
		Say there is a goroutine, gr1, it does 7 things, out of which 6th thing takes a hell lot of time
		You have another goroutine, gr2, it does 3 things.
		The 2nd and 3rd things in gr2 needs to be executed only after the 4th thing is executed in gr1.
		So you send a "done" message via a channel from gr1 to gr2 as soon as 4th thing is done in gr1 so that 2nd and 3rd things can be done in gr2

	BENIFIT:
		The gr2 didn't have to wait for all the 7 things to be finished from gr1 so that it can execute the rest operations
		Hence, optimisation as hell
*/

// All goroutines are asleep - DEADLOCK! - exit status 2
/*
	If either data extraction or data injection or both are out of
	For you to pass any value to a channel there must be something already present which will be listening to it

		1~> myCh <- 69
		2~> fmt.Println(<-myCh)

	In this case line 1 has the data injection and line 2 has the listener.. but line 1 doesn't know about line 2 ~(>_<~)
	If you flip

		1~> fmt.Println(<-myCh)
		2~> myCh <- 69

	Now there is no value coming for the listener because data injection is on the next line.
	These situations are called deadlocks.
	If you don't want the deadlock, you have to have atleast one go routine which is either sending or receiving data
	And isn't this obvious channels are a way through which goroutines can communicate with each other.. what will no goroutine do with the channel?
*/

func main() {
	// creating a channel
	myCh := make(chan int)
	//             ^   ^
	// 			   |   |
	//    to specify   ----- To specify what kind of value will be passed through a channel
	// that you wanna

	// Creating a buffered channel
	// myBuffCh := make(chan int, 1)
	//                         ^
	// 	     		           |
	//                         ----- To specify number of data injections to a channel without any listeners

	/*
		Understanding the channel syntax
		----
		|  | <- implies putting a value into box (aka channel)
		----

		   ----
		<- |  | implies getting a value from box (aka channel)
		   ----

		NOTE: arrow always points towards left ( <- )
	*/

	wg := &sync.WaitGroup{}
	// writing to a closed channel is not allowed but listening is and that returns a value of 0...
	// now if it's actual value or is it closed how to check

	// fmt.Println(<-myCh) // -> DEADLOCK since no value is received and you just wanted to extract a value from channel
	// myCh <- 5
	// tryout different cases
	go func(c chan int, w *sync.WaitGroup) {
		// fmt.Println(<-myCh)
		// c <- 5
		close(c)
		// c <- 6 // This stays in the channel buffers until there is someone to listen to it.
	}(myCh, wg)

	fmt.Println(<-myCh)
	if val, isChannelOpen := <-myCh; isChannelOpen {
		fmt.Println(val)
	} else {
		fmt.Println("The channel is closed")
	}
	// fmt.Println(<-myCh)

	/*
		Unidirectional channel
		inCh chan<- int => Receive ONLY
		outCh <-chan int => Send ONLY

		you can't close a receive only cahnnel
	*/
}
