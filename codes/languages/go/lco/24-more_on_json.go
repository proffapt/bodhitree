package main

import (
	"encoding/json"
	"fmt"
)

type course struct {
	//  ^  small case NOTE: means I don't want it to be exported; Private
	Name     string `json:"coursename"` // using `json:"something"` this field which was supposed to be "Name" will be referred to as "coursename" while handling this struct as a JSON data.
	Price    uint16
	Platform string `json:"website"`
	Password string `json:"-"` // Private data and don't want to send them in json using "-"
	// Tags     []string `json:"tags, omitempty"`
	// 								 ^ The syntax doesn't support space around comma, keep in mind! >> NOTE
	Tags []string `json:"tags,omitempty"`
	// 								  ^ Will omit the entry while handling in JSON format if it's empty (nil)
	// Without this it would return "null" which would have to be handled separately if this didn't exist
}

func main() {
	encodeJSON()
}

// Creating JSON data from given data is also known as
// Encoding the data into JSON or JSON format
func encodeJSON() {
	lcourses := []course{
		{"Java", 399, "proffapt.me", "fuck_your_momma", []string{"learning", "proffapt", "java-course"}},
		{"Kotlin", 499, "proffapt.me", "fuck_your_dadda", nil},
	}
	fmt.Println(lcourses)
	// Mehh, doesn't look good. right?

	// Marshal is basically the method to create JSON from given data.
	databyte, _ := json.Marshal(lcourses)
	fmt.Println(string(databyte))
	// Mehh wtf again..

	JSON, _ := json.MarshalIndent(lcourses, "", "\t")
	// 								Prefix 	^     ^ Indent
	// 										|	  |
	// 	     Used just before indent --------	  ---- To be used in the starting
	fmt.Println(string(JSON))
}
