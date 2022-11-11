package main

import (
	"fmt"
	"time"
)

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
