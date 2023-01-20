package main

import (
	"fmt"
	"sort"
)

func main() {
	// arrays - (size-declration) + more abstraction + features = slices
	// ** Syntax 1
	/*
		This syntax is exact photocopy of the methods used to create an array
		But with a very obvious catch, in both methods you don't have to specify the
		size explicitly while creating the slice as in case with array.

		That can NOT  be done using

		var ms []int -> Created a slice
		ms[0] = 1
		ms[1] = 2
		ms[2] = 3
		ms[3] = 4
		|
		--> Invalid: Adding values like an array

		Rather: use append()
	*/

	// ** SYNTAX 1a
	var test []int
	fmt.Println(test)
	fmt.Printf("type of ms is: %T\n", test)
	test = append(test, 69)
	fmt.Println(test)

	// ** SYNTAX 1b
	var ms = []int{1, 2, 3, 4}
	// ms := []int{1, 2, 3, 4} // --> WORKS too
	// ms := []int{} // --> creating an empty slice 
	// CAUTION!: ^^ This is NOT equivalent to test := [0]int{} -> is an array
	fmt.Println(ms)

	// appending
	ms = append(ms, 5, 6)
	fmt.Println(ms)
	/*
		ms[6] = 7
		fmt.Println(ms)
		^ This will give error, only append will help you with that
	*/
	ms[5] = 7
	fmt.Println(ms)
	fmt.Printf("Datatype representation of Slice is = %T\n", ms)

	// Slicing the slices
	slice1 := append(ms[1:]) // start from the index 1
	// Ok so disecting the above statement will result in
	// slice1 is the reference
	// ms[1:] is what that is going to be used as something I call base slice
	// and since no more arguments are provided, then nothing more is gonna be added to the base slice
	fmt.Println(slice1)
	slice2 := append(ms[:4]) // go till the index 3
	fmt.Println(slice2)
	/*
		The logic is like this
		fucking_something[m:n] here [m:n] == [m, n), the last bound is not included!
	*/
	slice3 := append(ms[2:4]) // from index 2 to 3
	fmt.Println(slice3)

	// ** Syntax 2
	/*
		Utilising DMA

		- You CAN"T initialise it.
		- Have to set a minimum of size to allocate during initialisation

		So, it's like slices with minimum size.
	*/
	slice := make([]int, 4)
	// slice := make([]int{1, 2, 3, 4}, 4) -> You just can't initialise it!
	// 					^ will give error as []int{...} is not a type
	slice[0]=1
	slice[1]=2
	slice[2]=3
	slice[3]=4
	fmt.Println(slice)
	slice = append(slice, 0) 
	/*
		Here's what's make it better and different from an array!
		because everything other than it was similar to an array.

		Some words about appending to DA-slice ( I named it Dynamically Allocated Slice )
		- Reallocation of memory is done so that all of the values can be accomodated.
		 --> Lot of optimisations happens because of this.
	*/
	fmt.Println(slice)
	fmt.Println(sort.IntsAreSorted(slice))
	sort.Ints(slice) // --> Sorts a slice of ints in increasing order
	fmt.Println(slice)
	fmt.Println(sort.IntsAreSorted(slice))

	// Deleting a value from slice
	slice = append(slice[:2], slice[3:]...) // --> removes the element in 2nd index
	// It utilised the concept of variadic arguments
	fmt.Println(slice)
	delete(slice, 2)
}
