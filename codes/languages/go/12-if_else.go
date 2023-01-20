package main

import (
	"fmt"
	"bufio"
	"os"
	"strconv"
	"strings"
)

func main() {
	loginCount := 96
	var result string

	if loginCount < 25 {
		result = "Hey, why you inactive check this out!"
	} else if loginCount > 50{
		result = "Hey, you so active give some more moniii"
	} else {
		result = "Typical average user"
	}
	/*
		Some words about the looks of the loop
		YOU CAN NOOOT change the place of "{" or "else"
		You wanna know why? ---> LEXER!!!
		if you do that, if you really change the location, 
		lexer will put a ';' there after "25" which will be syntaxically wrong
		Now you will be wondering what good does placing '{' after 25 do?
		--> when the LEXER encouters '{' it skips adding a ';' and we are safe again.
	*/
	fmt.Println(result)

	// alternate way, the go wayyy
	// useful when we put the web request's output in a variable and simultaneously check and decide our actions on the go
	reader := bufio.NewReader(os.Stdin)
	logincount, _ := reader.ReadString('\n')
	if logincount, _ := strconv.ParseInt(strings.TrimSpace(logincount), 10, 64); logincount == 69 {
		// ^ Consider this part as getting the value of web request					^ And this as deciding along the go on what to do with it
		result = "You have acquired a holy state"
	} else {
		result = "You are an unholy soul"
	}
	fmt.Println(result)
}
