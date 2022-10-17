package main

// IMPORTANT ADVICE
/*
	Neither Read Respance nor Response.Write closes a connection.
	That is, whenever you are making a request you have to make sure that
	neither your reader nor your writer is closing that request.
*/
import (
	"fmt"
	"net/http"
)

const url string = "https://lco.dev"

func main() {
	data, err := http.Get(url)
	checkNilError(err)
	fmt.Printf("Type of 'data': %T\n", data)
	fmt.Println("data = ", data.StatusCode)
}

func checkNilError(err error) {
	if err != nil {
		panic(err)
	}
}
