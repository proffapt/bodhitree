package main

import (
	"fmt"
	"net/http"
	"net/url"
)

const strurl string = "http://localhost:8000/postform"

func main() {
	postRequestFORM()
}

func postRequestFORM(){
	// constructing data

	data := url.Values{}

	data.Add("username", "proffapt")
	data.Add("password", "mein_nahin_bataunga")
	data.Add("email", "proffapt@pm.me")

	response, err := http.PostForm(strurl, data)
	cne(err)

	fmt.Println(response)
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
