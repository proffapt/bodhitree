package main

import (
	"fmt"
	"io/ioutil"
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
	defer response.Body.Close()

	content, _ := ioutil.ReadAll(response.Body)
	fmt.Println(content)
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
