package main

import "fmt"

func main() {
	langs := []string{"c", "cpp", "python", "ruby", "rust"}
	fmt.Println(langs)

	// The RANGE for
	for i := range langs { 
		fmt.Println(langs[i])
	}
	fmt.Println("")

	// The FOR-EACH for
	for _, lang := range langs {
		fmt.Println(lang)
	}
}
