// Closures
/*
	Combination of function bundled together with REFERENCES to its 
	surrounding state (aka lexical environment)

	NOTE
		why inphasis on REFERENCES?
		if you change the value of some variable after definition of function but before it's execution, the value will be updated
*/

let passed = 4

// let addTwo = (passed)=>{
let addTwo = ()=>{
	let inner = 2
	return passed+inner
	/*
		In js variables defined outside of function are available to it.
		Because of something is called lexical scoping
			Inner elements aren't available outside, but outer elements are available inside

		- The function is able to access `passed` because it formed closure with it
		- Closures are functions with preserved data
	*/
}

// console.log(addTwo(4))
console.log(addTwo())
// Importance of returning REFERENCES to the surrounding state
passed = 5
console.log(addTwo())

//// Looking into the function
console.dir(addTwo) // Run it in a chromium based browser

// A better example
addTwo = (passed)=>{
	let add = (inner)=>{
		return passed+inner	
	}
	return add
}

let addThree = addTwo(3) // setting up passed - preserved in addThree
/*
	- After this part You might think, `passed` must have been destroyed, since the function -addTwo - was executed.
	- So how will the inner function - add - use `passed`?
	- Indeed the OG `passed` was destroyed but addThree contained a combination of inner function - add - along with the value of `passed` - its lexical environment
*/
console.log(addThree(5)) // passing inner
// When this addThree is executed, it used the value of `passed` from the closure and the function add got its argument from the argument of addThree itself (since it was returned and stored to addThree along with its lexical environment)

// Why the fuck tho?
/*
	Suppose you have a button and you want to change the background to red when it's clicked
		button.onclick = function(){
			document.body.style.backgroundcolor = `red`
		}
		// Will work. All good.

	What if you have 200 such buttons?
		function clickHandler(color){
			document.body.style.backgroundcolor = `${color}`
		}
		button.onclick = clickHandler('red') // Won't work as intended
			// We need to pass a reference to the function not execute it. 
			// This will execute the function even without clicking the button
		button.onclick = clickHandler // Won't even work
			// How will you pass the color?
			// If you pass the color it will be executed

	This is exactly where CLOSURES come into play
*/
function clickHandler(color){
	let inner = ()=>{
		document.body.style.backgroundcolor = `${color}`
		// Due to closure inner can now access the color variable
	}
	return inner
	// Returning a funciton's reference
	// Bundled with the value of color
	// Forming a closure
}
button.onclick = clickHandler('red') // will return reference to a funciton
// This will convert into
/*
	button.onclick = ()=>{
		document.body.style.backgroundcolor = `red` // will be taken from closure
	}
	
*/
