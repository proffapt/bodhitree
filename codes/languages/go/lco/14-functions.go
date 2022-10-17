package main

import "fmt"

func main() {
	greeting()
	// NOTE: 'greeting' the function's name is a reference to it.
	result := adder(4, 7)
	fmt.Println(result)
}

func greeting(){
	fmt.Println("Hewwooo OwO")
}

		// This indicates the return type of a function, if multiple then enclose them in brackets
		// 				  ^
		// 				  |
func adder(a int, b int) int { 
// func adder(a int, var b int) int {  --> INVALID
	return a+b
}

// order of the funtion's declration doesn't matter in any fuking way possible.

// Anonymous functions and Imediately invoked functions are possible too, we gonna learn about them later
