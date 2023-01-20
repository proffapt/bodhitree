// ORM
/*
ORMs are better way of working with the database.
If you are worried about performance - that will come into action when you are having >5M queries -
Yes, for that case it might make your application slower

Direct Database Drivers:
Most optimised and efficient you can get.
*/

// Go file structure
/*
	In the project directory there should be only ONE *.go file it can be main.. it can not be as well.
	So that's why we make folders and keep files in them even if it's just a single extra file.

	- One package name inside a directory say the name of directory is `database` then name the packages as `whatsoever` for every file inside the directory
	- Things inside same directories need not to be imported

	NOTE ** `go mod tidy` and others should be run in the root directory of the project
*/
package main

import (
	"fmt"
	"log"
	"net/http"

	router "github.com/proffapt/dotfiles/routers"
)

func main() {
	fmt.Println("API is up and running ...")
	r := router.Router()

	// Starting the server
	log.Fatal(http.ListenAndServe(":4000", r))
}
