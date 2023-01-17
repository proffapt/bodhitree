// EVENT - A signal that signifies that something has happened
// Some important events
/*
	* Mouse Events
		- click
		- contextmenu
		- mouseover/mouseout
		- mouseup/mousedown
		- mousemove
		- mouseenter

	* Keyboard Events
		- keydown/keyup

	* form element events
		- focus
		- submit

	* Document events
		- DOMContentLoad
	
*/
// Handling events in the HTML itself
/*
	<div class="container">
		<button onclick="alert('button clicked'); console.log("button dabaya")">Click Me</button>
	</div>

	- on<event>: onclick, onmouseover & so on..
	- But the thing is you can't write everything in a single line
	  I mean yes you can but that will reduce the readability of the code.
*/
// Handling events in separate JS file: Method 1
let a = document.getElementById("my-id")
a.onclick = ()=>{
	a.innerHTML = "Mouse Click Kiya"
}

// NOTE
// Javascript event handling with overwrite within HTML event handling

// Handling events in separate JS file: Method 2 via eventListeners
a.addEventListener('click', ()=>{
	console.log("button was clicked")
}) // Adds a listener for handling click events
//// Removing a listener is a tricky part - It requires the exact function to be passed while removing the listener
/*
	a.removeEventListener('click', ()=>{
		console.log("button was clicked")
	})

	This won't work as the function appears to be same but it is not!
	This is a same looking function in diff memory location
*/
// Correct way to do it
let x = ()=>{
	console.log("button was clicked")
}
a.addEventListener('click', x)
a.removeEventListener('click', x)

// Event object
let y = (e)=>{
	console.log(e) // Complete object with all the properties of the event site.. location of mouse and so on..
	console.log(e.target) // Complete HTML element for the target (button in this case)
	console.log(e.type) // click
	console.log(e.clientX, e.clientY) // X, Y coordinates of the mouse cursor when the button was clicked
	console.log("button was clicked")
}
