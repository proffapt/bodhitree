package main

import "fmt"

func main() {
	langs := []string{"c", "cpp", "golang", "python", "ruby", "rust"}
	fmt.Println(langs)

	// The NORMAL for
	for i:=0; i<len(langs); i++ { // If there was array and it had some empty value, then len(langs) will be a bit off-track
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
	fmt.Println()
	/*
		Observation:
		- If using single variable, you get the index( in case of slices / arrays ) & key( in case of maps ) by default
		- In multivariable, the syntax is (INDEX, VALUE) OR (KEY, VALUE) pairs
	*/

	// The WHILE for
	randomvalue := 10
	for randomvalue > 0 { // Unlike C where I had to do: for( ; randomvalue < 0; ) {
		fmt.Printf("%v, ", randomvalue)
		randomvalue--
	}
	fmt.Printf("\b\b\n")

	// BREAK and CONTINUE are obvious here.

	// GOTO statements with names
	for _, lang := range langs {
		fmt.Println(lang)
		if lang == "golang" {
			goto ilg // this how you use a go to
		}
		// loop:
		// 	fmt.Println("Back to loop?")
	}

	ilg: // any non-reserved keyword followed by a ':' - becomes a goto reference
		fmt.Println("I love Golag!")
		// goto loop --> This won't work because goto CAN'T jump BACKWARDS
}
