package main

import (
	"fmt"
	"net/url"
)

const urlpath string = "https://proffapt.me:6969/eol?user=arpit&session_id=kla45q14"

func main() {
	fmt.Println("The url is: ", urlpath)
	
	// Parsing (extracting information from) the URL
	ustruct, err := url.Parse(urlpath)
	cne(err)
	fmt.Printf("Type of 'ustruct': %T\n", ustruct)
	fmt.Println("Printing info about the url.")
	fmt.Println("Protocol = ", ustruct.Scheme)
	fmt.Println("Hostname = ", ustruct.Hostname())
	fmt.Println("Port = ", ustruct.Port())
	fmt.Println("Host = ", ustruct.Host)
	fmt.Println("SubDir = ", ustruct.Path)
	fmt.Println("RawQuery = ", ustruct.RawQuery)
	fmt.Println("Query = ", ustruct.Query())

	// Extracting different params from the raw query..
	qparams := ustruct.Query()
	fmt.Println("User = ", qparams["user"])
	fmt.Println("session_id = ", qparams["session_id"])
	// NOTE
	/*
		The order in which the params are stored is not guranteed in this kind of datatypes.
	*/


	// Constructing a URL from the data given
	urlDetails := &url.URL{
		Scheme: "https",
		Host: "proffapt.me", 
		Path: "/s3x",
		RawQuery: "user=guest",
	}

	// fmt.Println("The URL is: ", string(urlDetails)) --> not valid
	fmt.Println("The URL is: ", urlDetails.String())
}

func cne(err error) {
	if err != nil {
		panic(err)
	}
}
