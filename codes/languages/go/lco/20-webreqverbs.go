package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
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
	databyte, _ := ioutil.ReadAll(response.Body)
	fmt.Println("Content: ", string(databyte))
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
