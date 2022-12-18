package main

import "fmt"

func main() {
	var ptr *int // defalut value of <nil>
	fmt.Println("Default value of pointer is", ptr)

	var number = 3
	numPtr := &number
	// var numPtr = &number
	// var numPtr *int = &number
	// |
	// ---> all of the above are valid syntaxes
	fmt.Println("Value of numPtr is", numPtr)
	fmt.Println("Value stored in the memory of numPtr is", *numPtr)

	*numPtr = *numPtr + 2
	fmt.Println("New value of number is", number)

	// but but but
	a := 3
	b := a
	a = a+2
	fmt.Println("a =", a, "b =", b)

	x := 3
	y := &x
	*y = *y+2
	fmt.Println("x =", x, "y =", *y)
}
