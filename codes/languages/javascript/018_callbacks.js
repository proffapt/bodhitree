// Synchronous & Asyncrhonous Programming
/*
	Synchronous - Step by step, you wait until the step(s) before you is/are finished
	Asyncrhonous - You just go on without waiting for previous step(s) to end
		EXAMPLE: settimeout & setinterval
	
	To get more clarity, let's consider settimeout in Synchronous mode and Asyncrhonous mode:
		- Synchronous
			// CODE
				step 1
				settimeout step 2, 3
				step 3
			// RESULT
				step 1
				wait for 3 seconds & do nothing
				step 2
				step 3
		- Asyncrhonous
			// CODE
				step 1
				settimeout step 2, 3
				step 3
			// RESULT
				step 1
				background waiting for step 2 and continue
				step 3
				step 2 after 3 seconds from execution of settimeout
*/
// Callbacks
function loadScript(src, callback){
	let script = document.createElement('script')
	script.src=src
	script.onload=()=>{
		console.log("Script has been loaded successfully!")
		// What if you wanted to execute a function of your own choice 
		// instead of this block and that too will be specified on runtime..
		// We use callbacks for this..
		callback()
	}
	document.body.append(script)
}
function hello(){
	alert("Hello World!")
}
loadScript("https://kahin.se.bhi.lelo", hello)
/*
	This is called 'callback-based' style of asynchronous programming.
	A asynchronous function when completes executes a function which signifies the completion of that
	asynchronous task. That function is called callback function. Here, the completion can be a success or a failure.
*/

// Handling errors
