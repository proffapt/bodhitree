package main

import "fmt"

// Basically I can just run this file using go run tool and voila it will work
// But this is not the standard / good way of doing it

/*
1. You first have to initialise the mod using:
go mod init github.com/proffapt/modules

					^
					|
					----- Is the location where the code is going to be hosted.
	=> Will create a basic `go.mod` file having
		- Go version
		- Place where the code is hosted in terms of module

2. Fetch a module from web
go get -u github.com/gorilla/mux

^ will also to tell the other user that this repo is going to be utilised so better get it
adds an entry of this module along with exact version
and for added layer of security via checksum it adds hash to that particular version in `go.sum` file
btw it actually recied in "$GOHOME/pkg/mod/cache/download"

3. `go mod tidy`
NOTE will fix the `go.mod` and `go.sum` files
If something was there but not used -> will be removed after it
If something wasn't there and was used -> will be added after it

### // indeirect
This will be there in `go.mod` file with modules which are not used but are there
after using `go mod tidy`
*/
func main() {
	fmt.Println("Welcome to mod in golang")
}
