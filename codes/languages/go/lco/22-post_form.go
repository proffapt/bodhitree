package main

import "fmt"

const url string = "http://localhost:8000/postform"

func main() {
	postRequestFORM()
}

func postRequestFORM(){
	
}

func cne(e error) {
	if e != nil {
		panic(e)
	}
}
