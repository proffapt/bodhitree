package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	// generating random numbers
	rand.Seed(time.Now().UnixNano()) // Best way for generating random number.. UnixNano() is a must!!

	diceNumber := rand.Intn(6)+1

	switch diceNumber {
		case 1:
			fmt.Println("Weee, it's a 1")
		case 2:
			fmt.Println("Weee, it's a 2")
		case 3:
			fmt.Println("Weee, it's a 3")
		case 4:
			fmt.Println("Weee, it's a 4")
			fallthrough // will fall to the very next case only, NOOOT till the end!
		case 5:
			{ 
				fmt.Println("Weee, it's a 5")
				fmt.Println("Wait! Did we just have a fallthrough here?") }
		case 6:
			fmt.Println("Weee, it's a 6")
		default:
			fmt.Println("What the fuck was that!?")
	}
}
