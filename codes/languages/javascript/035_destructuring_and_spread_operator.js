// Destructuring

//// Destructuring arrays
var [a, b] = [3, 4]
console.log(`a=${a}, b=${b}`)
// [a, b] = [3, 4, 5] // -> won't work!
/*
	This works only when initialising.
	Re-assigning the value will result in error
	*/
var [a, b] = [3, 4, 5]
console.log(`a=${a}, b=${b}`)
var [a, b, c] = [3, 4, 5]
console.log(`a=${a}, b=${b}, c=${c}`)

var [a, b, ...rest]=[1, 2, 3, 4, 5, 6, 7, 8, 9]
console.log(`a=${a}, b=${b}, rest=${rest}`)

var [a, , , ...rest]=[1, 2, 3, 4, 5, 6, 7, 8, 9] // Skipping two elements
console.log(`a=${a}, rest=${rest}`)

//// Destructuring Objects
var {a, b} = {a: 1, b: 2}
console.log(`a=${a}, b=${b}`)


// Spread Syntax aka Variadic functions in Golang
let arr = [1, 2, 3, 4, 5, 6 , 7, 8, 9]
let obj = {...arr}
console.log(obj)

let sum = (...a)=>{
	let sum = 0
	for (i of a){
		sum+=i
	}
	console.log(sum)
}

sum(1, 3, 4) // Remember, variadic functions..
sum(1, 3, 4, 5) // Remember, variadic functions..
sum(...arr)

// Following will be highly used in React
obj = {
	name: "proffapt",
	company: "proff industries pvt. ltd.",
	address: "127.0.0.1"
}
console.log(obj)
// Over-writing some fields
console.log({
	...obj, 
	name:"jaggu"
})

// Won't work as expected
console.log({name:"jaggu", ...obj}) 
// Because you should provide the value to be over-written first
