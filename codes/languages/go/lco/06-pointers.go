package main

import "fmt"

func main() {
	var ptr *int
	fmt.Println("Default value of pointer is ", ptr)

	var number = 3
	// numPtr := &number
	var numPtr = &number
	fmt.Println("Value of numPtr is ", numPtr)
}
