
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

func (u *User) setemail(mail string){
	u.Email = mail
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20}
	// since methods are functions connected / under structs, they need to be called from object of those structs
	proffapt.getdata()
	proffapt.setemail("me@proffapt.me")
	proffapt.getdata()
}
