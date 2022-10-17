package main

// Just like other langs we can play with only '.txt' files
// For some other types of files there are specific libraries.

import (
	"fmt"
	"io"
	"io/ioutil"
	"os"
)

const filepath string = "./17_ki_file.txt"
const content string = "This will be going to a file"
// rememeber walrus operator doesn't work in global and stuff

func main() {
	// creating and closing a file
	// VERY VERY IMPORTANT, Close the file using defer at the time of creation only
	// so that I don't forget it later on
	file, err := os.Create(filepath)
	checkNilError(err)
	defer file.Close()
	fmt.Printf("Type of 'file': %T\n", file)
	fmt.Println("file = ", file)

	// writing into a file
	io.WriteString(file, content)

	// reading a file
	databyte, err := ioutil.ReadFile(filepath)
	checkNilError(err)
	fmt.Printf("Type of 'databyte': %T\n", databyte)
	fmt.Println("Databyte = ", databyte)
}

func checkNilError(err error){
	if err != nil{
		panic(err)
	}
}
