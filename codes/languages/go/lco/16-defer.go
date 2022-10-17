package main

import "fmt"

// defer == delayed
// that line of code with defer in the start is placed in the very end of the code, and hence is executed in the very end too.
// Follows LIFO, logical hai.
func main() {
	defer fmt.Println("!")
	defer fmt.Print("You")
	fmt.Print("Fuck ")
}
