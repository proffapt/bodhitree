package main

import "fmt"

func main() {
	var array [4]string
	array[0] = "apple"
	array[1] = "microsoft"
	array[2] = "samsung"
	array[3] = "tesla"

	fmt.Println(array[3])
	fmt.Println(array)
}
