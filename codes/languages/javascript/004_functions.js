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

// IIFEs
/*
	It is used to avoid polluting the global namespace
	Creates the memory, uses it.. deletes it.
	Otherwise would have waited for the invoking of the variable before clearing the memory.
	*/
let life = function() {
	console.log("This is how you create an Immediately Invoked Function in JS");
}();
// Yet another method
(function () {
	console.log("This is yet another method on how you create an Immediately Invoked Function in JS");
})();

let iife = (() => {
	console.log("This is how you create an Immediately Invoked Function in JS in Arrow function form")
})();

// Arrow Functions
var af = () => console.log("You can write it without brackets"); console.log("This is not part of the function, this is a new statement") 
af()
af = variable => console.log(`variable = ${variable}`) // Works only when there is only one argument needed
af(69)
var obj = {
	name: "proffapt",
	sex: "nahi mila",
	run: ()=>{
		// console.log(`${this.name} is running`) // this.name won't work with arrow functions
		/*
			Because Arrow function's this contains the reference to its parent's lexical environment
		*/
		console.log(`${obj.name} is running`) 
	},
	walk: function(){
		// Both works
		console.log(`${this.name} is walking`)
		console.log(`${obj.name} is walking`)
	},
	sleep: function(){
		let that = this
		(() =>{
			// Utilising the fact that arrow function's this is basically this of it's parent block/element
			// Won't work when this arrow function is replaced by the `function` syntax
			console.log(`${this.name} is sleeping`)
			console.log(`${that.name} is sleeping`) // Older trick/workaround
		})();
	}
}
// this
/*
	1. Used DIRECTLY within a function NOT created by arrow method, inside an object == reference to that object
	2. Alone == global object
	3. Inside an Event == reference to the element calling the EVENT
	4. For arrow function == reference to the element for it's parent (just outer environment) according to above 3 rules.
		Basically apna `this` nahi banata, apne parent se leleta hai this
	*/

obj.run()
obj.walk()
obj.sleep()
