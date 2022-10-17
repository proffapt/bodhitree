package main

// Just like other langs we can play with only '.txt' files
// For some other types of files there are specific libraries.

import "fmt"

const file = "./17_ki_file.txt"
const content = "This will be going to a file"

func main() {
	
}

func checkNilError(err error){
	if err != nil{
		panic(err)
	}
}
