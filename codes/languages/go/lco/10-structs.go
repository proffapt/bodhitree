package main

import "fmt"

type User struct {
	Name string
	Email string
	Verified bool
	Age int
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20}
	fmt.Println(proffapt)
}
