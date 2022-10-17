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
	fmt.Printf("Type of 'ustruct': %T", ustruct)
}

func cne(err error) {
	if err != nil {
		panic(err)
	}
}
