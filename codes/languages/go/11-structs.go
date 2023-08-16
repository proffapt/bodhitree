package main
// no concept of inheritance in golang, neither super nor parent.
import "fmt"

// Syntax of struct 
type User struct { // FOCUS ON "User" that capital U has an importance, it means this struct User is publicly avaialable to use
	Name 		string
	Email 		string
	Verified	bool
	Age 		int
	// above had same capital letter, which carry the same meaning.
}

func main() {
	proffapt := User{"Arpit", "proffapt@pm.me", true, 20} // -> You have to provide all the data
	fmt.Println(proffapt)
	fmt.Printf("%v\n", proffapt)

	// for more detailed output
	fmt.Printf("%+v\n", proffapt)

	// for individual stuff - All the three means the same!
	fmt.Printf("%v\n", proffapt.Age)
	fmt.Printf("%+v\n", proffapt.Name) // -->> To note, it is same like earlier
	fmt.Println(proffapt.Email)

  // Creating inline structs
  dog := struct {
    name string
    isGood bool
  }{
    "Rex",
    true,
  }
  fmt.Println(dog)
}
