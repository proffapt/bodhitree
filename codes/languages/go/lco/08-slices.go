package main

import "fmt"

func main() {
	// arrays without size-declration are slices
	ms := []int{1, 2, 3, 4}
	// can also be done using
	/*
		var ms []int
		ms[0] = 1
		ms[1] = 2
		ms[2] = 3
		ms[3] = 4
	*/
	fmt.Println(ms)
	// appending
	ms = append(ms, 5, 6)
	fmt.Println(ms)
	ms[6] = 7
	fmt.Println(ms)
}
