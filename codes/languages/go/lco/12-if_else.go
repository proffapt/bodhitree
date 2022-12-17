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
	/*
		Some words about the looks of the loop
		YOU CAN NOOOT change the place of "{" or "else"
		You wanna know why? ---> LEXER!!!
		if you do that, if you really change the location, 
		lexer will put a ';' there after "25" but when it encouters '{' it skips doing it.
	*/
	fmt.Println(result)

	// alternate way, the go wayyy
	// useful when we put the web request's output in a variable and simultaneously check and decide our actions on the go
	if logincount := 96; logincount == 96 {
		result = "You have acquired a holy state"
	}
	fmt.Println(result)
}
