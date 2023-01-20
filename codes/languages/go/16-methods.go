package main

import "fmt"

type User struct {
	Name string
	Email string
	Verified bool
	Age int
	gender string // -> this property right here will not be "exportable" that is it is not public
}

// Functions connected with structs are called methods

// This is the basic declration
// Object of the struct connected to the method - this is also the part of function signature
// 	  ^	
// 	  |	
func (u User) getdata(){
// You can pass either a property of the struct or an entire struct that's upto you
// well everything other than the name of function and the keyword `func` itself, is the signature of the function.
	fmt.Println(u)
}

// Note that to make sure things are changed in real,
// and their copy wasn't passed into the function
// Always use pointer as the type of argument.
func (u *User) setemail(mail string){
// func (u User) setemail(mail string){ // -> will not change the real memory, will alter the copy of it and as function 
// terminates so does the copied memory.
	u.Email = mail
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20, "male"}
	// since methods are functions connected / under structs, they need to be called from object of those structs
	proffapt.getdata()
	proffapt.setemail("pm@proffapt.me")
	proffapt.getdata()
}
