package main

import "fmt"

func main() {
	languages := make(map[string]string)
	languages["py"] = "python"
	languages["cpp"] = "c++"
	languages["sh"] = "bash"
	languages["java"] = "java"

	fmt.Println(languages)
	fmt.Println(languages["py"])
	
	// deleting an entry
	delete(languages, "py")
	fmt.Println(languages)
}
