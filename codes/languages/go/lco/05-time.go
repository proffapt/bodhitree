package main

import (
	"fmt"
	"time"
)

func main() {
	currentTime := time.Now()
	fmt.Println(currentTime)
	fmtdCurrentTime := currentTime.Format("Monday 01/02/2006 15:04:05")
	fmt.Print(fmtdCurrentTime)

	myDate := time.Date(2021, time.August, 11, 23, 9, 0, time.UTC)
	fmt.Print(myDate)
}
