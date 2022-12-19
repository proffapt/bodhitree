package main

import "fmt"

func main() {
	// Declaration
	var array [4]string
	fmt.Printf("Type of array is: %T\n", array)
	array[0] = "apple"
	array[1] = "microsoft"
	array[3] = "tesla" 
	fmt.Println(array[3])
	fmt.Println(array) // notice an extra space is there between tesla and microsoft - to indicate empty element
	fmt.Println(len(array))

	// CAUTION!
	/*
		var testArray []string // this DOESN'T mean an array of length '0'
		>>> 	what this mean is a "SLICE" 
		fmt.Printf("Type of testArray %T\n", testArray)

		testArray[0] = "apple" -> This alone will give error since this is for an array whose size is atleast '1'
		>>>		Instead you will do this
		testArray = append(testArray, "fuck", "her")
		fmt.Println(testArray)
	*/

	// Initialisation
	var myArray = [3]string{"fuck", "your", "momma"}
	fmt.Println(myArray)
}
