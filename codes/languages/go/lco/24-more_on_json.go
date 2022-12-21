package main

import (
	"encoding/json"
	"fmt"
)

type course struct {
	//  ^  small case NOTE: means I don't want it to be exported; Private
	// These are basically aliases to struct properties while being handled as JSON
	Name     string `json:"coursename"` // using `json:"something"` this field which was supposed to be "Name" will be referred to as "coursename" while handling this struct as a JSON data.
	Price    uint16
	Platform string   `json:"website"`
	Password string   `json:"-"` // Private data and don't want to send them in json using "-"
	Tags     []string `json:"tags,omitempty"`
	// 							     ^ Will omit the entry while handling in JSON format if it's empty (nil)
	// Without this it would return "null" which would have to be handled separately if this didn't exist
	// *********** TAKE A LOOK *************
	// Tags     []string `json:"tags, omitempty"`
	// 								 ^ NOTE: The syntax doesn't support space around comma, keep in mind! >> NOTE
}

func main() {
	// encodeJSON()
	decodeJSON()
}

// Creating JSON data from given data is also known as
// Encoding the data into valid JSON
func encodeJSON() {
	// arbitrary data
	lcourses := []course{
		{"Java", 399, "proffapt.me", "fuck_your_momma", []string{"learning", "proffapt", "java-course"}},
		{"Kotlin", 499, "proffapt.me", "fuck_your_dadda", nil}, // Why this ','?
		// Because it's course{} aur uska jab slice banaoge toh aisa hi hota hai.. it is not just another slice of string or int like before
	}
	fmt.Println(lcourses)
	// Mehh, doesn't look good. right?
	// This is not even JSON

	// Marshal is basically the method to create JSON from given data.
	databyte, _ := json.Marshal(lcourses) // Takes interface as an input aka struct
	fmt.Println(string(databyte))
	// Mehh wtf again..

	// JSONdatabyte, _ := json.MarshalIndent(lcourses, "", "\t")
	JSONdatabyte, _ := json.MarshalIndent(lcourses, ">", "\t")
	// 						   			     Prefix  ^     ^ Indent
	// 												 |	   |
	// 	     	      Used just before indent --------	   ---- To be used in the starting
	// Every time tab is pressed before it ">" is added
	fmt.Println(string(JSONdatabyte))
}

// Consuming the JSON data: basically getting JSON data and playing with it.
func decodeJSON() {
	JSONdata := []byte(`
		{
			"coursename": "Kotlin",
			"Price": 499,
			"website": "proffapt.me",
			"tags": ["learning","proffapt","java-course"]
		}
	`) // Iss back-tick se uske andar ka sara data byte ki slice mein convert hojayega <<***********************************
	fmt.Println(JSONdata)
	// Ok so why the fuck []byte?
	// Remember everytime we did ioutil.ReadAll(response.Body), what we got is DATABYTE and later we converted it to string
	// So, this means that whatever data we receive from web is in the `[]byte` format
	// This time we have created those data bytes for the sake of simplicity and will convert it to something else

	if isValid := json.Valid(JSONdata); isValid {
		// Ok so with that out of the way.. Is this data even JSON.. and if it is then is it in the correct JSON format or not? Let's verify
		// If it passes in then it was indeed a valid json

		// 1. When you want to put the data received into the struct you have created
		var lcourses course
		json.Unmarshal(JSONdata, &lcourses) // Obviously unmarshelling means getting the data from json
		// 						 ^ Since it's a method and to make sure you don't pass a copy of the variable we pass the pointer to it
		fmt.Println(lcourses)

		// 2. When you just want to get a map[key]value from the data and extract value using keys
		var mcourses map[string]interface{}
		//        For sure ^       ^ Since key can be anything we provide an interface arbitrarily to handle the arbitrary type
		json.Unmarshal(JSONdata, &mcourses)
		// 						 ^ Since it's a method and to make sure you don't pass a copy of the variable we pass the pointer to it
		fmt.Println(mcourses)
		// Obviously we can loop through it
		for key, value := range mcourses {
			fmt.Println("Key =", key, "# value =", value)
			fmt.Printf("Type of %v is %T\n", value, value)
		}
	} else {
		fmt.Println("JSON data we received is INVALID!")
	}
}
