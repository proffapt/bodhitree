package main

import "fmt"

func main() {
	var array [4]string
	array[0] = "apple"
	array[1] = "microsoft"
	array[3] = "tesla" // notice an extra space is there between tesla and microsoft - to indicate empty element

	fmt.Println(array[3])
	fmt.Println(array)
	fmt.Println(len(array))

	var myArray = [3]string{"fuck", "your", "momma"}
	fmt.Println(myArray)
}
