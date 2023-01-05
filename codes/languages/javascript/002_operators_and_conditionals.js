const prompt = require("prompt-sync")();
l = console.log
// OPERATORS
/*
	Following is a valid js program
	77
	"proffapt"
	false
*/
// I know the basic operators already.. things to note are:
l(45/4) // gives exact value in float
// Normal
l(6 == "6")
l(6 != "6")
// New
// Triple = does a type check along with value check which double = doesn't!
l(6 === "6") // False
l(6 !== "6") // True

// CONDITIONALS
console.clear()
let a = prompt("Hey what's your age? ")
l(a, typeof a)
a = Number.parseInt(a) // Converting a from whatever to Int
l(a, typeof a)

// If .. else if .. else
if (a<0){
	l("Ho bhi tum?")
}
else if (a<35){
	l("Javani chal rahi")
}
else {
	l("Budhapa aa gaya")
}

// switch - exactly similar to C
switch (a) { // must wrap arround ()
	case 0:
		l("hein?")
		break // Very important to break.. you know why.. to prevent fall-through
	case 69:
		l("holy age acheived")
	default:
		l("jhoom jhoom")
}

// ternary operator
a = (69 > 79) ? "Sahi baat hai" : "Chutiya gaye ho ka?"
//  ^expression     ^ Executed when	      ^ Executed when expression is false
// 				   expression is true
l(a)
// OR
l((69 > 79) ? "Sahi baat hai" : "Chutiya gaye ho ka?")
