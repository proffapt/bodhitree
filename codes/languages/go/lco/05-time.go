package main

import (
	"fmt"
	"time"
)

func main() {
	currentTime := time.Now()
	fmt.Println(currentTime)
	fmtdCurrentTime := currentTime.Format("01/02/2006 15:04:05")
	fmt.Print(fmtdCurrentTime)
}
