// Function creation is like other langs - returning and stuff, anonymous, lambda, IIFs & ARROW functions (Preferred JS syntax for anonymous functions)
// Preferred way of creating functions in js are ARROW FUNCTIONS
let a = 6
let b = 9
const hardCodedSum = () => {
	return a+b
} // ********* This is why we create functions in this manner.. because we don't have pointers in javascript ************  

// Aliter
/*
const aliterHardCodedSum = function () {
	return a+b
} // ********* This is why we create functions in this manner.. because we don't have pointers in javascript ************  
*/

const twoSum = (a, b) => {
	return a+b
}

console.log(twoSum(5,8))
console.log(hardCodedSum())

// IIFs
let life = function() {
	console.log("This is how you create an Immediately Invoked Function in JS");
}();
// Yet another method
(function () {
	console.log("This is how you create an Immediately Invoked Function in JS");
})();

// Won't work
/*
let iife = () => {
	console.log("This is how you create an Immediately Invoked Function in JS")
}()
*/
