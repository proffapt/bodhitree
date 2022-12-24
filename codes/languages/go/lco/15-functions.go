package main

import "fmt"

// order of the funtion's declration doesn't matter in any fuking way possible.

// Types of functions:
/*
	- Anonymous Functions:
		Functions without a name
	- Immediately Invoked Functions:
		Anonymous functions which are executed at the time of declaration
	- Lambda Functions:
		Anonymous function assigned to a variable

	CONCLUSION:
		The later two are a type of Anonymous function
			* When anonymous function is called at the time of its declaration it's IIFs.
			* When the output of anonymous function is stored in a variable it's Lambda function.
*/

func greeting() {
	fmt.Println("Hewwooo OwO")
}

// The last "int" indicates the return type of a function, if multiple then enclose them in brackets
func adder(a int, b int) int {
	// 		   ^	 ^    ^
	// 		   |	 |	  |
	//		   -------------------- These combined are called function signatures.
	// func adder(a int, var b int) int {  // --> INVALID
	return a + b
}

// THE VERIADIC FUNCTIONS
// Name of slice storing all the inputs you gonna give to the function
//
//	^
//	|
func proAdder(a ...int) (int, string) {
	sum := 0
	for _, i := range a { // again, first value is INDEX, second value is VALUE. INDEX is by default value.
		sum += i
	}
	return sum, "This was your sum"
}

func main() {
	greeting()
	// NOTE: 'greeting' the function's name is a reference to it.

	result := adder(4, 7)
	fmt.Println(result)

	proResult, proMessage := proAdder(5, 6, 6, 7, 7, 3, 5, 6, 9)
	fmt.Println(proResult)
	fmt.Println(proMessage)
}
