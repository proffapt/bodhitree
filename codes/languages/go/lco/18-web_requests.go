package main

// IMPORTANT ADVICE
/*
	Neither Read Respance nor Response.Write closes a connection.
	That is, whenever you are making a request you have to make sure that
	neither your reader nor your writer is closing that request.
*/
import (
	"fmt"
	"io/ioutil"
	"net/http"
)

const url string = "https://lco.dev"

func main() {
	response, err := http.Get(url)
	checkNilError(err)
	defer response.Body.Close() // caller's (your) responsibility
	fmt.Printf("Type of 'response': %T\n", response)
	body, err := ioutil.ReadAll(response.Body)
	checkNilError(err)
	fmt.Println(string(body))
}

func checkNilError(err error) {
	if err != nil {
		panic(err)
	}
}
