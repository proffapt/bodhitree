package main

import "fmt"

// Capital letter to this variable has significant importance here
// --> It is declaring it as Public variable.
const LoginToken string = "adfjal879qeojalkfjasdfada8du7f9q"

func main() {
	var username string = "proffapt"
	fmt.Println(username)
	fmt.Printf("Variable is of type: %T\n", username)

	var isLoggedIn bool = true
	fmt.Println(isLoggedIn)
	fmt.Printf("Variable is of type: %T\n", isLoggedIn)

	// more into integers
	// uintX => [0, (2**X)-1]
	// intX => [-2**(X-1), 2**(X-1)-1]
	// uint8 == byte
	// int32 == rune
	var smallVal uint8 = 255
	fmt.Println(smallVal)
	fmt.Printf("Variable is of type: %T\n", smallVal)

	var smallFloat float32 = 255.2342342
	fmt.Println(smallFloat)
	fmt.Printf("Variable is of type: %T\n", smallFloat)

	var largeFloat float64 = 255.2342342
	fmt.Println(largeFloat)
	fmt.Printf("Variable is of type: %T\n", largeFloat)

	var test int // default value is 0
	fmt.Println(test)
	fmt.Printf("Variable is of type: %T\n", test)

	var tstring string // default value is newline
	fmt.Println(tstring)
	fmt.Printf("Variable is of type: %T\n", tstring)

	// implicit method of declaration
	var website = "proffapt.me" // here comes lexer and adds the Type judging from the initialised value
	fmt.Println(website)
	// website = 5 -> Not allowed to change datatype.
	fmt.Printf("Variable is of type: %T\n", website)

	// no var style - the walrus operator
	users := 3 // not allowed outside any method Like global and stuff
	// users = "haha" -> Not allowed to change the type
	fmt.Println(users)
	fmt.Printf("Variable is of type: %T\n", users)


	fmt.Println(LoginToken)
	fmt.Printf("Variable is of type: %T\n", LoginToken)
}
