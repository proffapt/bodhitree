package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	// creating the reference to our reader
	reader := bufio.NewReader(os.Stdin)

	// and this is how you can use similar statements in single line separated by ';'
	fmt.Print("Enter the rating for my github page: "); input, _ := reader.ReadString('\n') // Read till ENTER is pressed
	fmt.Printf("Type of entered value is %T\n", input)

	fmt.Println("You gave us rating of", input) // as in python ',' adds a space.
}
