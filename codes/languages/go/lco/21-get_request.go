package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"strings"
)

const url string = "http://localhost:8000"

func main() {
	GetRequest(url)
}

func GetRequest(url string) {
	response, err := http.Get(url)
	cne(err)
	defer response.Body.Close()

	fmt.Println("Status Code: ", response.StatusCode)
	fmt.Println("Content Length: ", response.ContentLength)
	var responseString strings.Builder // --> Creating the builder
	databyte, _ := ioutil.ReadAll(response.Body)
	responseString.Write(databyte) // Building the string using the builder; databyte as input
	fmt.Println("Content: ", responseString.String())
	// Alternative
	// fmt.Println("Content: ", string(databyte))
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
