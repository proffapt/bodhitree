package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Rate my github profile in between 1 to 5: ")
	rating, _ := reader.ReadString('\n')

	fmt.Print("Thanks for rating my profile, ", rating)
}
