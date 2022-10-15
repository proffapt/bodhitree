package main

import "fmt"

const LoginToken string = "adfjal879qeojalkfjasdfada8du7f9q"

func main() {
	var username string = "proffapt"
	fmt.Println(username)
	fmt.Printf("Variable is of type: %T\n", username)

	var isLoggedIn bool = true
	fmt.Println(isLoggedIn)
	fmt.Printf("Variable is of type: %T\n", isLoggedIn)

	var smallVal uint8 = 255
	fmt.Println(smallVal)
	fmt.Printf("Variable is of type: %T\n", smallVal)

	var smallFloat float32 = 255.2342342
	fmt.Println(smallFloat)
	fmt.Printf("Variable is of type: %T\n", smallFloat)

	var largeFloat float64 = 255.2342342
	fmt.Println(largeFloat)
	fmt.Printf("Variable is of type: %T\n", largeFloat)

	var test int
	fmt.Println(test)
	fmt.Printf("Variable is of type: %T\n", test)

	// implicit method of declaration
	var website = "proffapt.me" // here comes lexer and adds the Type judging from the initialised value
	fmt.Println(website)
	fmt.Printf("Variable is of type: %T\n", website)

	// no var style
	users := 3 // not allowed outside any method Like global and stuff
	fmt.Println(users)
	fmt.Printf("Variable is of type: %T\n", users)
}
