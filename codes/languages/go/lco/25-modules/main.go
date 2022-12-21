package main

import (
	"fmt"
	"log"
	"net/http"

	"github.com/gorilla/mux" // go get -u github.com/gorilla/mux let this happen to automaitcally arrive
)

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

	>>> go mod verify >>> Can be used to verify the checksum of package used

btw it actually recied in "$GOHOME/pkg/mod/cache/download"

3. `go mod tidy`
NOTE will fix the `go.mod` and `go.sum` files
If something was there but not used -> will be removed after it
If something wasn't there and was used -> will be added after it

### // indeirect
This will be there in `go.mod` file with modules which are not used but are there
after using `go mod tidy` will also handle it accordingly

******** go mod ... operations are expensive ************

## Useful commands

~> go list
github.com/proffapt/modules -> internal modules for the current project

~> go list all -> every existing packages on the system

~> go list -m all
github.com/proffapt/modules
github.com/gorilla/mux v1.8.0 -> current project, all required modules (external and internal)

~> go list -m -versions github.com/gorilla/mux
github.com/gorilla/mux v1.2.0 v1.3.0 v1.4.0 v1.5.0 v1.6.0 v1.6.1 v1.6.2 v1.7.0 v1.7.1 v1.7.2 v1.7.3 v1.7.4 v1.8.0 -> Existing versions of the package to know directly from the terminal and utilise if required

~> go mod why -m all
# github.com/proffapt/modules
github.com/proffapt/modules

# github.com/gorilla/mux
github.com/proffapt/modules : This
github.com/gorilla/mux 		: Dependent on this
-> Tells you why you are dependent on the packages

~> go mod graph
github.com/proffapt/modules github.com/gorilla/mux@v1.8.0

	             ^							^
				 |							|
				This				Depends on this
				(left) 					(Right)

// Recommended way to edit `go.mod`
~> go mod edit -go 1.16 > Change the version of go

~> go mod edit -module github.com/proffapt/yam > Change the main module name

### Important observations
  - `-m all` to any command to get information for things being used in the current project only

### Every external package is in cache dir, so if you deply to some server how you gonna do that?
### OR say you wanna modify some bit of the code in the package itself and then use it..
  - Like you can put all the stuff in the project dir and the put it on server
    `go mod vendor`
    ^
    |
    -------- Creates a `vendor` folder just like node_modules with the packages
  - and now force go to use the things inside the project dir
    `go run -mod=vendor main.go`
*/
func main() {
	fmt.Println("Welcome to mod in golang")
	// Using gorilla mux - Forget about the details it is here just for the sake of `go mod ...`
	r := mux.NewRouter()
	r.HandleFunc("/", homeServer).Methods("GET")
	// 		      ^ 	  ^
	// 		  	  |   	  |
	//  Responding to   What function to call..
	//   requests in
	//     homedir

	// Running a server in golang
	log.Fatal(http.ListenAndServe(":4000", r)) // log.Fatal logs whenver something goes wrong
	// 		  		        ^ 	 ^
	// 		  	            |    |
	//                     Host  router
	//                 Hostname:Port
}

func homeServer(w http.ResponseWriter, r *http.Request) {
	// 				     ^ 					  ^
	// 					 |   				  |
	//     to reply to user's request		To get exact request and it's content
	w.Write([]byte("<h1>Hello from proffapt</h1>"))
	//         ^ We received everything from the web in []byte format so that means it's the standard so that's what we gonna send
}
