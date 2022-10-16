package main

import "fmt"

func main() {
	loginCount := 69
	var result string

	if loginCount < 25 {
		result = "Hey, why you inactive check this out!"
	} else {
		result = "Hey, you so active give some more moniii"
	}

	fmt.Println(result)
}
