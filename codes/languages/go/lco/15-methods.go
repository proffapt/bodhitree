
package main

import "fmt"

type User struct {
	Name string
	Email string
	Verified bool
	Age int
}

// umm functions connected to structs are called methods
// This is the basic declration
func (u User) getdata(){
	fmt.Println(u)
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20}
	proffapt.getdata()
}
