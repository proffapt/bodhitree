package main

// IMPORTANT ADVICE
/*
	You might read somewhere in the documentation itself that connection 
	will be closed after reading the body. NOTE THAT:
	Neither ReadResponce nor Response.Write ever closes a connection.

	That is, whenever you are making a request you have to make sure that
	IT"S YOUR RESPONSIBILTIY TO CLOSE THAT RESPONSE
*/
import (
	"fmt"
	"io/ioutil"
	"net/http"
)

const url string = "https://lco.dev"

func main() {
	// response, err := http.Get(url)
	// checkNilError(err)
	// aliter of the stuff ^^
	// The golang style
	if response, err := http.Get(url); err !=nil {
	//   ^ This has a scope limited to this if-elif-else block only, out of it; it doesn't exist
		panic(err)
	} else {
		defer response.Body.Close() // caller's (your) responsibility
		fmt.Printf("Type of 'response': %T\n", response)
		databyte, err := ioutil.ReadAll(response.Body) // firse.. ioutil se read karne par exact data nahi databyte milta hai!
		checkNilError(err)
		fmt.Println(string(databyte))
	}
}

func checkNilError(err error) {
	if err != nil {
		panic(err)
	}
}
