package main

import (
	"fmt"
	"time"
)

func main() {
	currentTime := time.Now()
	fmt.Println(currentTime)
	fmtdCurrentTime := currentTime.Format("Monday 01/02/2006 15:04:05")
	// Standard values
	// Day: Monday
	// Date: 01/01/2006 or some other style like 01-02-2006
	// Time: 15:04:05
	fmt.Println(fmtdCurrentTime)

	// creating a custom time
	myDate := time.Date(2021, time.August, 11, 23, 4, 9, 0, time.UTC)
	//													 ^ Nanosecond
	fmt.Print(myDate)
}
