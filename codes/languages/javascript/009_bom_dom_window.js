// Window
/*
	everything browser provides is under window.
	it's a global object so no need to explicitly mention it.

	document.body == window.document.body
	*/
// DOM - Document Object Model
/*
	All of your HTML(hence CSS coz you will be sourcing it in HTML file itself) code is packed inside one object.. called the DOM

	Example:
	window.body.style.background="red" // -> Changes the background color to red
	*/
// BOM - Browser Object Model
/*
	Everything other then DOM is packed inside BOM.
	like redirection requires access to tab functionality of browser which is not a part of DOM.. it will be a part of BOM

	Example:
	location.href="https://example.com" // -> Redirects the user to this website
	*/

// Examples of functionalities provided by BOM :- Alert, Prompt & Confirm
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
