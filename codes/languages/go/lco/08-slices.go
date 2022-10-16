package main

import (
	"fmt"
	"sort"
)

func main() {
	// arrays without size-declration are slices
	// ** Syntax 1
	/*
		You have to initialise the slice while using this syntax
		That is can NOT  be done using

		var ms []int
		ms[0] = 1
		ms[1] = 2
		ms[2] = 3
		ms[3] = 4
		|
		--> Invalid

		var ms []int{}
		|
		--> Invalid

		>> Rather you will have to do this
		ms := []int{}
	*/
	var ms = []int{1, 2, 3, 4}
	// ms := []int{1, 2, 3, 4} --> WORKS too
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

		- Doesn't require you to initialise it
		- Have to set a minimum of size to allocate during initialisation

		So, it's like slices with minimum size.
	*/
	slice := make([]int, 4)
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
}
