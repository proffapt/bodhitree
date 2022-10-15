package main

import "fmt"

func main() {
	// arrays without size-declration are slices
	ms := []int{1, 2, 3, 4}
	fmt.Println(ms)
}
