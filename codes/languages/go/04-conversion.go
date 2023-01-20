package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Rate my github profile in between 1 to 5: ")
	rating, _ := reader.ReadString('\n')

	fmt.Println("Thanks for rating my profile,", rating)

	// numRating := rating+1 --> it's all good, but what if we get an error? How will you handle it?
	numRating, err := strconv.ParseFloat(strings.TrimSpace(rating), 64) // TrimSpace trimmed off the ENTER from the input rating
	// And 64 means for float64 and 32 means for float32
	if err != nil {
		panic(err) // panic prints the error and ends the program right there!
		// fmt.Println(err) -> will only print the error and the program will continue
	} else {
		fmt.Println("Thanks for rating my profile, ", numRating+1)
	}
}
