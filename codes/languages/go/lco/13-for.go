package main

import "fmt"

func main() {
	langs := []string{"c", "cpp", "golang", "python", "ruby", "rust"}
	fmt.Println(langs)

	// The NORMAL for
	
	for i:=0; i<len(langs); i++ {
		fmt.Println(langs[i])
	}
	fmt.Println()
	// NOTE: there is no '++i' anywhere in Golang, only 'i++'

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

	// BREAK and CONTINUE are obvious here.

	// GOTO statements with namess
	for _, lang := range langs {
		fmt.Println(lang)
		if lang == "golang" {
			goto ilg // this how you use a go to
		}
		cont:
			continue
	}

	ilg: // any non-reserved keyword with ':' after it becomes a goto reference
		fmt.Println("I love Golag!")
		goto cont
}
