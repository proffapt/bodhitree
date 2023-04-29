package main

import (
	"fmt"
)

func main() {
	var steps int
	fmt.Print("Enter the step levels of the fountain: ")
	fmt.Scanln(&steps)

	for i := 1; i <= steps; i++ {
		for a := i - 1; a > 0; a-- {
			fmt.Print("-")
		}
		fmt.Print(i)
		if i != steps {
			for b := 1; b < 2*steps-2*i; b++ {
				fmt.Print("-")
			}
			fmt.Print(i)
		}
		fmt.Println()
	}

	for i := steps - 1; i > 0; i-- {
		for a := i - 1; a > 0; a-- {
			fmt.Print("-")
		}
		fmt.Print(i)
		if i != steps {
			for b := 1; b < 2*steps-2*i; b++ {
				fmt.Print("-")
			}
			fmt.Print(i)
		}
		fmt.Println()
	}
}
