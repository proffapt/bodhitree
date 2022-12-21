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

	fmt.Println("Status:", response.Status)
	fmt.Println("Status Code:", response.StatusCode)
	fmt.Println("Protocol :", response.Proto)
	fmt.Println("Protocol version HTTP/THIS.ignore:", response.ProtoMajor)
	fmt.Println("Protocol version HTTP/ignore.THIS:", response.ProtoMinor)
	fmt.Println("Content Length:", response.ContentLength)
	// This is the method which I might see in some code to just get the data from databyte - "response"
	var responseString strings.Builder // --> Creating the builder
	databyte, _ := ioutil.ReadAll(response.Body)
	length, _ := responseString.Write(databyte) // Building the string using the builder; databyte as input
//    ^  This is general idea that whenever something writes it returns the length of content it wrote in total
	fmt.Println("Length of content written:", length)
	fmt.Println("Content:", responseString.String())
	//                                       ^ This is the reason people like this method because they can convert to whatever format they want without any side-hustle as they hold the raw data in the Builder.
	// Alternative
	fmt.Println("Content:", string(databyte))
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
