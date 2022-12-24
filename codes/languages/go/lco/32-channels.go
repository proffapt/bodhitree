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
	For you to pass any value to a channel there must be something already present which will be listening to it

		1~> myCh <- 69
		2~> fmt.Println(<-myCh)

	In this case line 1 has the data injection and line 2 has the listener.. but line 1 doesn't know about line 2 ~(>_<~)
	If you flip

		1~> fmt.Println(<-myCh)
		2~> myCh <- 69

	Now there is no value coming for the listener because data injection is on the next line.
	These situations are called deadlocks. Remember that "Andaa pehle aya ya murgi" wahi hai ye XD

	If you don't want the deadlock, you have to have atleast one go routine which is SENDING data
	And isn't this obvious channels are a way through which goroutines can communicate with each other.. what will no goroutine do with the channel?
*/

// creating a channel
var myCh = make(chan int)

//	              ^   ^
//	              |   |
//	     to specify   ----- To specify what kind of value will be passed through a channel
//     that you wanna

// Creating a buffered channel
var myBuffCh = make(chan int, 1)

//                            ^
// 	                          |
//                            ----- To specify number of data injections to a channel without any listeners

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

var wg = &sync.WaitGroup{}

func main() {
	oneGoRoutine()
	oneGoRoutineReversed()
	twoGoRoutines()
	// twoValuesOneListener() // -> DEADLOCK
	twoValuesTwoListeners()
	bufferedChannel()
	closingChannels()
	checkingChannelState()
	unidirectionalChannels()
}

func oneGoRoutine() {
	// fmt.Println(<-myCh) // -> Won't work because channel se le toh raha hun lekin iss statement ko kya pata koi bhej bhi raha hai ki nahi **DEADLOCK
	go func() {
		myCh <- 1
	}()
	fmt.Println(<-myCh) // -> Isne dekha koi goroutine gaya hai just pehle toh usme hoga koi value
	// Nahi hogi toh mein fir deadlock error throw kardunga
}

func oneGoRoutineReversed() {
	// myCh <- 2 // -> Bhej toh rahe ho lekin usse kahan pata chal raha ki koi sunne wala hai bhi ki nahi
	go func() {
		fmt.Println(<-myCh)
	}()
	myCh <- 2
}

func twoGoRoutines() {
	wg.Add(2)
	go func() {
		fmt.Println(<-myCh)
		wg.Done()
	}()
	// Yahan farak nahi padta pehle extraction ka karo ya injection ka, kyunki iss bar extraction go routine mein hai toh usse pata hai kabhi na kabhi
	// Kahin na khin koi toh data bhejega

	go func() {
		myCh <- 3
		wg.Done()
	}()
	wg.Wait()
}

func twoValuesOneListener() {
	wg.Add(2)
	go func() {
		fmt.Println(<-myCh)
		wg.Done()
	}()

	go func() {
		myCh <- 4
		myCh <- 5 // It will let the call proceed since it assumes someone might be listening for it.. but pehle ko listen kiya.. and no one else.. deadlock
		wg.Done()
	}()
	wg.Wait()
}

func twoValuesTwoListeners() {
	wg.Add(2)
	go func() {
		fmt.Println(<-myCh)
		fmt.Println(<-myCh)
		wg.Done()
	}()

	go func() {
		myCh <- 4
		myCh <- 5
		wg.Done()
	}()
	wg.Wait()
}

func bufferedChannel() {
	wg.Add(2)
	go func() {
		fmt.Println(<-myBuffCh)
		wg.Done()
	}()

	go func() {
		myBuffCh <- 6
		myBuffCh <- 7 // Will be buffered
		// myBuffCh <- 8 // -> Will not be buffered since the option for buffered (without a listener) was 1
		wg.Done()
	}()
	wg.Wait()
}

func closingChannels() {
	/*
		Writing to a closed channel is NOT allowed.
		But listening is and that returns a value of 0...
		Now if it's actual value or is it closed? How to check?
	*/
	wg.Add(2)
	go func() {
		fmt.Println(<-myBuffCh) // But listening to it is allowed and returns a value of zero
		wg.Done()
	}()

	go func() {
		close(myBuffCh)
		// myBuffCh <- 8 // -> Writing to a closed channel is not allowed
		// myBuffCh <- 9
		// close(myBuffCh) // -> Will work since we are Closing after passing the values
		wg.Done()
	}()
	wg.Wait()
}

func checkingChannelState() {
	/*
		Finding whether the 0 is an actual value or it's because the cahnnel is closed
	*/
	wg.Add(2)
	go func() {
		if val, isOpen := <-myCh; isOpen {
			fmt.Print(val)
		} else {
			fmt.Println("OOPS the channel was closed")
		}
		wg.Done()
	}()

	go func() {
		// myCh <- 0 // -> Is valid.. and will work
		close(myCh)
		wg.Done()
	}()
	wg.Wait()
}

func unidirectionalChannels() {
	/*
		Unidirectional channel
		inCh := make(chan<- int) => Send ONLY
		outCh := make(<-chan int) => Receive ONLY

		Send and Receive are from the perspective of channel
			chan<- means this channel is getting the value into it; so what it will do SEND!
			<-chan means this channel is getting used to take out the value; so what it will do RECEIVE!

		NOTE ** You can't close a receive only cahnnel
	*/

	inCh := make(chan<- int)
	outCh := make(<-chan int)
	wg.Add(2)
	go func() {
		// close(outCh) // -> can't close a receive only channel variable type
		if val, isOpen := <-outCh; isOpen {
			fmt.Print(val)
		} else {
			fmt.Println("OOPS the channel was closed")
		}
		wg.Done()
	}()

	go func() {
		// myCh <- 0 // -> Is valid.. and will work
		close(inCh)
		wg.Done()
	}()
	wg.Wait()
}
