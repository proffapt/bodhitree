package main

import (
	"fmt"
	// "math/rand"
	"crypto/rand"
	// "time"
	"math/big"
)

func main(){
	var a int = 1
	var b float64 = 5
	// c := a+b -> will give error, MISMATCHED TYPE!
	c := a+int(b) // Explicit type conversion.
	// Tho this can be used to convert "number" datatypes to int but not others like strings for that you have strconv.ParseInt()
	fmt.Println(c)

	// random numbers
	// rand.Seed(30) -> but since the seed is same the algorithm will always flow from this seed and give the same result everytime
	// to make sure this seed is actually random, we will be using something that is always changing that is TIME!

	// rand.Seed(time.Now().UnixNano())
	// fmt.Println(rand.Intn(5)) // random number from [0,5)

	// cryptographic random number
	randi, _ := rand.Int(rand.Reader, big.NewInt(5)) // same [0, 5)
	fmt.Println(randi)
}
