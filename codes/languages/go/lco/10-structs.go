package main
// no inheritance concept in golang, neither super and parent.
import "fmt"

// Syntax of struct 
type User struct { // FOCUS ON "User" that capital U has an importance, it means this struct User is publicly avaialable to use
	Name string
	Email string
	Verified bool
	Age int
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20}
	fmt.Println(proffapt)
	fmt.Printf("%v\n", proffapt)

	// for more detailed output
	fmt.Printf("%+v\n", proffapt)

	// for individual stuff
	fmt.Printf("%v ", proffapt.Age)
	fmt.Println(proffapt.Email)
}
