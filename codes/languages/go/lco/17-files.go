package main

import "fmt"

// Just like other langs we can play with only '.txt' files
// For some other types of files there are specific libraries.
func main() {

}

func checkNilError(err error){
	if err != nil{
		panic(err)
	}
}
