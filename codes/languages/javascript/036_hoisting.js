// Hoisting
/*
	Late declaration are put into top of the code - Apparently

	- Works only with var, NOT with let and const
	- Declaration part is hoisted but Initialisation part is NOT
	- Functional Expressions (lambda function) aren't hoisted
*/

console.log(a)
// let a // -> Won't work
var a

greet()
function greet(){
	console.log("good morning")
}

console.log(b)
var b = 9 // Will be same, because initialisation values aren't hoisted

test() // -> Won't work as well
var test = ()=>{
	console.log("good morning")
}
