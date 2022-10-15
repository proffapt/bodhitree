package main

import "fmt"

func main() {
	// arrays without size-declration are slices
	ms := []int{1, 2, 3, 4}
	fmt.Println(ms)
	// appending
	ms = append(ms, 5, 6)
	fmt.Println(ms)
}
