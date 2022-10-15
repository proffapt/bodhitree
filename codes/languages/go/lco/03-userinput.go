package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	// creating the reference to our reader
	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Enter the rating for my github page:")
	input, _ := reader.ReadString('\n')

	fmt.Println("You gave us rating of ", input)
}
