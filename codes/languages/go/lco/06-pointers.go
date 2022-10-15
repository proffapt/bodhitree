package main

import "fmt"

func main() {
	var ptr *int
	fmt.Println("Default value of pointer is ", ptr)

	var number = 3
	numPtr := &number
	// var numPtr = &number
	// var numptr *int = &number
	// |
	// ---> all of the above are valid syntaxes
	fmt.Println("Value of numPtr is ", numPtr)
	fmt.Println("Value stored in the memory of numPtr is ", *numPtr)
}
