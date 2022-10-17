package main

import "fmt"

func main() {
	langs := []string{"c", "cpp", "python", "ruby", "rust"}
	fmt.Println(langs)

	// The NORMAL for
	
	for i:=0; i<len(langs); i++ {
		fmt.Println(langs[i])
	}

	// The RANGE for
	for i := range langs { 
		fmt.Println(langs[i])
	}
	fmt.Println()

	// The FOR-EACH for
	for _, lang := range langs {
		fmt.Println(lang)
	}
	/*
		Observation:
		- If using single variable, you get the index by default
		- In multivariable, the syntax is INDEX, VALUE
	*/


}
