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

	fmt.Println("Thanks for rating my profile, ", rating)

	// numRating := rating+1 --> it's all good, but what if we get an error? How will you handle it?
	numRating, err := strconv.ParseFloat(strings.TrimSpace(rating), 64)
	if err != nil {
		panic(err)
	} else {
		fmt.Println("Thanks for rating my profile, ", numRating+1)
	}
}
