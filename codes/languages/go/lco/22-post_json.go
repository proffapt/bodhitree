package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"strings"
)

const url string = "http://localhost:8000/post"

func main() {
	postRequestJSON(url)
}

func postRequestJSON(url string){
	// fake JSON payload / data
	requestBody := strings.NewReader(`
		{
			"username":"proffapt",
			"country":"India",
			"browser":"firefox",
			"browser_version":21.2
		}
	`)
	response, err := http.Post(url, "application/json", requestBody)
	cne(err)
	defer response.Body.Close()
	databyte, _ := ioutil.ReadAll(response.Body)
	fmt.Println(string(databyte))
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
