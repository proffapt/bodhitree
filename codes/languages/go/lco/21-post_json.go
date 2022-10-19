package main

import (
	"fmt"
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
	fmt.Println(response.Body)
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
