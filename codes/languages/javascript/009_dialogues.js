// Alert, Prompt & Confirm
/*
	Properties:
		- Stop the execuition of js right there and waits for the input from the user
		  (Which basically can sometimes somehow be used for overcoming the async nature of js for very important actions)
	Limitations:
		- They have a fixed location and styling specific to the browser of interest.
		- Are Old looking
*/
// The following code will not work on node.js engine; run it in a browser
alert("To proceed you have to enter the value of a.")
let a = prompt("Enter the value of a here:", 69) // The other argument is the default value for the input
a = Number.parseInt(a)
alert("You entered a as" + a)
let happy = confirm("Are you happy with your value?") // returns true or false on pressing ok and cancel respectively
if (happy) {
	console.log("proceeding")
}
else {
	console.log("enter the number again")
}
