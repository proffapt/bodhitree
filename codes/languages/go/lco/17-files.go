package main

// Just like other langs we can play with only '.txt' files
// For some other types of files there are specific libraries.

import (
	"fmt"
	"io/ioutil"
	"os"
)

const file string = "./17_ki_file.txt"
const content string = "This will be going to a file"
// rememeber walrus operator doesn't work in global and stuff

func main() {
	file, err := os.Create(file)
	checkNilError(err)
	defer file.Close() // VERY VERY IMPORTANT, defered so that I don't forget it later on
	fmt.Println("Type of 'file': %T", file)

	// ioutil.ReadFile(file)
}

func checkNilError(err error){
	if err != nil{
		panic(err)
	}
}
