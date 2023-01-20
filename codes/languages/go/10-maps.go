package main

import "fmt"

func main() {
	// Maps == dict -> Key, value pairs
	languages := make(map[string]string)
	// can't use new like this because it will give errors
	// main error being no value additions directly as it creates "ZEROED started value"
	languages["py"] = "python"
	languages["cpp"] = "c++"
	languages["sh"] = "bash"
	languages["java"] = "java"
	// and so on...

	fmt.Println(languages)
	fmt.Println(languages["py"]) // -> again, logically key needs to be specified
	
	// deleting an entry
	delete(languages, "py") // -> takes in key as a second argument only
	fmt.Println(languages)
	delete(languages, "bash") // -> will not affect the map
	fmt.Println(languages)

	// looping through maps
	for key, value := range languages {
		fmt.Println("Key =", key, "> Value =", value)
	}
	// ^ The looping order is random
	for key, _ := range languages {
		fmt.Println(key)
	}
}
