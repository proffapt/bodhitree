package main

import "fmt"

func main() {
	// Declaration
	var array [4]string
	array[0] = "apple"
	array[1] = "microsoft"
	array[3] = "tesla" 
	fmt.Println(array[3])
	fmt.Println(array) // notice an extra space is there between tesla and microsoft - to indicate empty element
	fmt.Println(len(array))

	var testArray []string // this means an array of length '0'
	// var testArray = [0]string{} -> means the same thing as above
	// testArray[0] = "apple" -> This alone will give error since this is for an array whose size is atleast '1'
	fmt.Println(testArray)
	fmt.Println(len(testArray))

	// Initialisation
	var myArray = [3]string{"fuck", "your", "momma"}
	fmt.Println(myArray)
}
