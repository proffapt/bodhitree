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

import (
	"encoding/json"
	"fmt"
	"log"
	"math/rand"
	"net/http"
	"strconv"
	"time"

	"github.com/gorilla/mux"
)

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
	// Both should be filled
	// return c.CourseID == "" || c.CourseName == ""
	// I don't want to check for the CourseID now, Coz I will generate it myself
	return c.CourseName == ""
}

func main() {
	fmt.Println("The API is up and running")
	// Seeding: Populating fake data for testing purposes.
	courses = []Course{
		{"1", "Let's go with golang", 299, &Author{"Hitesh Choudhary", "learncodeonline.in"}},
		{"2", "Java Spring", 499, &Author{"Blad T", "blad.com"}}, // `,` add kiya hai taki aise likh saku warna lexer ake ";" lagadega
	}
	/*
		courses = []Course{{"1", "Let's go with golang", 299, &Author{"Hitesh Choudhary", "learncodeonline.in"}}, {"2", "Java Spring", 499, &Author{"Blad T", "blad.com"}}}
		^^ Isme ',' nahi lagana tha kyunki obvious hai

		courses is a slice of struct typed Course
		var course1 Course
		var course2 Course
		var course3 Course
		course = []Course{course1, course2, course3}
		course1 = Course{"1", "something", 333, &Author{"name", "website"}}
	*/
	courses = append(courses, Course{"3", "Android Development", 599, &Author{"Arpit Bhardwaj", "proffapt@pm.me"}})
	courses = append(courses, Course{CourseID: "4", CourseName: "Web Development", CoursePrice: 199, Author: &Author{"Arpit Bhardwaj", "proffapt@pm.me"}})
	// ^^ Multiple ways of adding data into a slice and combination with structs how we can add data into structs

	// Setting up the routing
	router := mux.NewRouter()
	router.HandleFunc("/", serveHome).Methods("GET")
	router.HandleFunc("/courses", getAllCourses).Methods("GET")
	router.HandleFunc("/course/{id}", getOneCourse).Methods("GET")
	router.HandleFunc("/course", addOneCourse).Methods("POST")
	router.HandleFunc("/course/{id}", updateOneCourse).Methods("PUT")
	router.HandleFunc("/course/{id}", deleteOneCourse).Methods("DELETE")

	log.Fatal(http.ListenAndServe(":8000", router))
}

// Controllers
/*
	These are functions which handle the routes.
	These are basically executed when a route is called with a specific method
	basically these are the backbone of Endpoints.. they are the ones which do stuff

	Basically HOW to handle a route with a particular method ("GET", "POST" etc.)
*/
// NOTE _ file

func serveHome(w http.ResponseWriter, r *http.Request) {
	// Standard practice is to use these readers and writers to send and read data.
	fmt.Println("Handling / ...")
	w.Write([]byte(`<h1>Welcome to proffapt's API</h1>`))
}

func getAllCourses(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get all the available courses")
	// To set headers - This is done for security reasons to prevent Content-Sniffing
	// What exactly is being done? - Telling the client about the "Content-Type" it should be expecting from the Server
	w.Header().Set("Content-Type", "application/json") // ("key", "value") pairs
	json.NewEncoder(w).Encode(courses)
	// Read from right -> Encode courses slice to json -> Inject it into the ResponseWriter (in form of []byte)
	/*
		What happend to Marshal and MarshalIndent?
		Well you can use it like..
		databyte, _ := json.MarshalIndent(courses)
		w.Write(databyte)

		It's better to directly use the capabilites given by json package to us
	*/
}

/*
Good Practice:
Generally we put all of the following stuff in just on single function
and using if else statements we decide what to do depending on the Method.

But for understanding purpose we gonna break this good practice

For ex:
The above function will be callled as just "courses" and the rest coming will be called as "course"
The actions for the later will be definend by the type of REQUEST METHOD.
*/

func getOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Get one course")
	w.Header().Set("Content-Type", "appliation/json")

	// grabbing the id
	params := mux.Vars(r)
	fmt.Println("Request parameters:", params) // Gives map[id:{id}]
	/*
		How is this different from earlier cases?
		Pehle hum request bhej rahe the aur fir uska response mil raha tha.
		Yahan humein request mil rahi toh uska response bhej rahe.

		Why not using URL?
		urlstruct := url.Parse(urlpath)
		urlstruct.Query() if the request is in this same format or urlstruct.Path and then later manipulate it further to get the courseid

		Why this?
		Because, gorilla/mux provides us with ease to extract the query parameter using mux.Vars(request)
		all the variable coming up will be automatically extracted with a single statement so it's an ease for us

		How?
		if we set the route using router.HandleFunc("/course/{id}", getOneCourse).Methods("GET")
		If r is the request - We can extract the id from the request using `r` as raw data and mux.Vars(r)
		mux.Vars(r) will give (key, value) pair of keys we add in the router configuration statement, for now we
		have seen only setup of one key.
	*/

	// looping through the courses and checking whether the id exists
	// if the id exists then send the course details via the writer.
	for _, course := range courses {
		if course.CourseID == params["id"] { // This {id} was given while setting up the router.
			json.NewEncoder(w).Encode(course)
			return
		}
	}
	invalid_response := "Given CourseID=" + params["id"] + " not found."
	json.NewEncoder(w).Encode(invalid_response)
}

func addOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Add one course")
	w.Header().Set("Content-Type", "application/json")

	// Now we will be recieving json data to be entered as a course toh we will have to store the received json data and decode it into soemthing we can use
	var newcourse Course
	json.NewDecoder(r.Body).Decode(&newcourse)
	// Read it from left to right
	// Take everything from r.Body -> Decode JSON -> Store it in newcourse

	// Having some precautions via handling vague requests
	if r.Body == nil { // Poori request hi khaali toh nahi bhejdi..
		json.NewEncoder(w).Encode("No data provided")
		return
	} else if check := newcourse.IsEmpty(); check { // {} This is not nil data but it's still has nothing and we made IsEmpty to check for minimum required data
		json.NewEncoder(w).Encode("Incomplete data provided")
		return
	}

	// Checking CourseName duplicacy
	for _, course := range courses {
		if course.CourseName == newcourse.CourseName {
			json.NewEncoder(w).Encode("An entry with same course name already exists")
			return
		}
	}

	// Adding the entry
	// courses = append(courses, newcourse)

	// CHALLENGE
	/*
		For the sake of learning let's generate random id and then add it to the data
		Just so that I don't rely on user to enter a unique id
	*/
	rand.Seed(time.Now().UnixNano())
	// newid := string(rand.Intn(100)) // -> Will not work
	/*
		string() -> Gives a string of rune
		we need a string of digits
		strconv.Itoa() -> Gives a string of digits
	*/
	// newid := strconv.Itoa(rand.Intn(100)) // -> Yet another method
	newid := len(courses)
	newcourse.CourseID = strconv.Itoa(newid + 1) // -> Changing the id given by user
	courses = append(courses, newcourse)
	json.NewEncoder(w).Encode("New entry added successfully")
}

func updateOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Update one course")
	w.Header().Set("Content-Type", "application/json")

	// Getting the new values from the request
	var newcourse Course
	json.NewDecoder(r.Body).Decode(&newcourse)

	// getting the id of course to be updated
	params := mux.Vars(r)

	// Updating
	for index, course := range courses {
		if course.CourseID == params["id"] {
			// deleting the entry to be updated
			courses = append(courses[:index], courses[index+1:]...)
			/*
				updating id of new entry with the old one.. coz you don't wanna change the unique ids
				basically this is all principals on how you wanna design your db it's upto you
				You might also have something where one unique id is only used once.. updating will also change the unique id
			*/
			newcourse.CourseID = params["id"]
			// adding new entry
			courses = append(courses, newcourse)
			response := "Entry with CourseID=" + params["id"] + " was updated successfully"
			json.NewEncoder(w).Encode(response)
			return
		}
	}
	invalid_response := "Given CourseID=" + params["id"] + " not found."
	json.NewEncoder(w).Encode(invalid_response)
}

func deleteOneCourse(w http.ResponseWriter, r *http.Request) {
	fmt.Println("Delete one course")
	w.Header().Set("Content-Type", "application/json")

	// get the id
	params := mux.Vars(r)

	// loop through database and search for that id
	// when found delete that entry
	for index, course := range courses {
		if course.CourseID == params["id"] {
			courses = append(courses[:index], courses[index+1:]...)
			response := "Entry with CourseID=" + params["id"] + " was deleted successfully"
			json.NewEncoder(w).Encode(response)
			return
		}
	}
	invalid_response := "Given CourseID=" + params["id"] + " not found."
	json.NewEncoder(w).Encode(invalid_response)
}
