package main

import (
	"fmt"
	"net/url"
)

const urlpath string = "https://proffapt.me:6969/blogs/eol?user=arpit&session_id=kla45q14" // ? starts query '&' is the comma of url world

func main() {
	fmt.Println("The url is: ", urlpath)
	
	// Parsing (extracting information from) the URL
	ustruct, err := url.Parse(urlpath)
	cne(err)
	fmt.Printf("Type of 'ustruct': %T\n", ustruct)
	fmt.Println("Data in 'ustruct':", ustruct)
	fmt.Println("Printing info about the url.")
	// _://_/_?_ : everything `_` will be a property.
	// Scheme://Host/Path?RawQuery
	// Dissecting `_` will need a sophisticated method
	fmt.Println("Protocol = ", ustruct.Scheme) // Predifined hoga hi.. toh directly property hogayi. 
	fmt.Println("Hostname = ", ustruct.Hostname()) // It's a method since we have to do more than just getting stuff in between `/` 
	fmt.Println("Port = ", ustruct.Port()) // 				^^ Same reason, ":" se separated the
	fmt.Println("Host = ", ustruct.Host) // Is the classic information
	fmt.Println("SubDir = ", ustruct.Path)
	fmt.Println("RawQuery = ", ustruct.RawQuery) // Wahi `?` ke bad jo kuch milraha.. RawQuery
	fmt.Println("Query = ", ustruct.Query()) // RawQuery ko disect kar rahe simple operation(Can't create a hardcoded method since number of query parameters will be unknown everytime) se zyada hai

	// Extracting different params from the raw query..
	qparams := ustruct.Query() // Returns a map
	fmt.Println("User = ", qparams["user"]) // All the keys are in string format
	fmt.Println("session_id = ", qparams["session_id"])
	// NOTE
	/*
		The order in which the params are stored is not guranteed in this kind of datatypes.
	*/


	// Constructing a URL from the data given
	// Very Important to remember that we pass a reference here
	//   		  ^
	// 			  |	
	urlDetails := &url.URL{ // Don't get overwhelmed with '&' url has a struct.. url.URL{data, data, data} bas isi ka address pass kar rahe
	//  ^  This is exactly our struct which we were handling before
		Scheme: "https",
		Host: "proffapt.me:7070", 
		Path: "/blogs/s3x",
		RawQuery: "user=guest&session_id=alkdfjadlfk",
	}
	fmt.Printf("Typeof `ustruct`: %T - Typeof `urlDetails`: %T\n", ustruct, urlDetails)
	// ^^ Shows that URL STRUCT must of type *url.URL -> pointer to it

	// fmt.Println("The URL is: ", string(urlDetails)) // --> NOOOOOT valid
	fmt.Println("The URL is:", urlDetails.String()) // Sophisticated "method" hence () is used
	fmt.Println("The URL is:", urlDetails) // bahahahaha
}

func cne(err error) {
	if err != nil {
		panic(err)
	}
}
