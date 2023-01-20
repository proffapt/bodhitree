/*
"request": "POST"
"Data"   : "url-encoded form" (aka Form-encoded)

Need? - Image upload and stuff
*/
package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
	"net/url"
)

const URL string = "http://localhost:8000/postform"

func main() {
	postRequestFORM()
}

func postRequestFORM() {
	// constructing data
	requestBody := url.Values{} // Remember this? Where have you seen this before??
	// This is the type of Query Parameters (response.Query()) -> which was basically a map.
	requestBody.Add("username", "proffapt") // ("key", "value")
	requestBody.Add("password", "mein_nahin_bataunga")
	requestBody.Add("email", "proffapt@pm.me")
	requestBody.Add("browser_version", "108.9") // key and value both must be string.
	// Just this; only the way of data generation is different

	response, err := http.PostForm(URL, requestBody)
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
