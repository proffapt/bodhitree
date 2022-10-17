package main

import "fmt"

// defer == delayed
// that line of code with defer in the start is placed in the very end of the code, and hence is executed in the very end too.
// Follows LIFO, logical hai.
func main() {
	// this will print the numbers in reverse order, and that too in the very end of program, as they were the first ones to go.. LIFO=FILO
	for i:= 1; i<6; i++{
		defer fmt.Println(i)
	}
	defer fmt.Println("!")
	defer fmt.Print("You ")
	// LIFO is followed, the last defer is executed first
	fmt.Print("Fuck ")
}
