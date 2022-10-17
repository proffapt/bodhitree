package main

import (
	"fmt"
	"net/url"
)

const urlpath string = "https://proffapt.me:6969/eol?user=arpit&session_id=kla45q14"

func main() {
	fmt.Println("The url is: ", urlpath)
	
	// Parsing (extracting information from) the URL
	url.Parse(urlpath)
}
