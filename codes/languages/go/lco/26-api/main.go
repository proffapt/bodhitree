// API Routes v/s Endpoints
/*
	Straight to the point:
	- Route: `https://proffapt.me/blogs/eol/1`
	- Endpoint: `GET https://proffapt.me/blogs/eol/1` or sometimes just `/blogs/eol/1`

	*** API ROUTE:
		- Name / URL used to acces the Endpoint
		- Location where the resource is located waiting to be served

	*** API ENDPOINT:
		- Performs some action like GET, DELETE, UPDATE, POST, PUT etc. on the API Route
		- These are functions available through the API
*/

package main

// Models
/*
	Defining how the courses are gonna be looking like.
	"Model" for the data in database.
*/
// NOTE _ file
type Course struct {
	CourseID    string  `json:"courseid"`
	CourseName  string  `json:"coursename"`
	CoursePrice int     `json:"price"`
	Author      *Author `json:"author"`
	//          ^ Just to make sure we don't get drawn into copied entities.. so use pointers for custom models/structs!
}

type Author struct {
	FullName string `json:"fullname"`
	Website  string `json:"website"`
}

// Usually both of them go into separate files inside models/ dir but this time we gonna keep them in one file

// Fake DataBase
var courses []Course

// Middlewares
/*
	They are there to perform some extra tasks like..
	- Encrypting the password
	- Doing a validity check on the query / data given in to the endpoint
*/
// NOTE _ file
func (c *Course) IsEmpty() bool {
	return c.CourseID == "" || c.CourseName == ""
	// Both should be filled
}

func main() {
}

// Controllers
