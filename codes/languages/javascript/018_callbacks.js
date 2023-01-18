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
function loadScript(src, callback){
	let script = document.createElement('script')
	script.src=src
	script.onload=()=>{
		console.log("Script has been loaded successfully!")
	}
	// **********
	script.onerror=()=>{
		callback(new Error("Error aa gaya guru")) // This is the way how you generate new Errors!
		// new Error("this error"); new ValueError("new type of error") -> can be used with throw keyword
	}
	// **********
	document.body.append(script)
}
function error_wala_hello(err){
	console.log(err)
	alert("Hello _error_ World!")
}
loadScript("https://kahin.se.bhi.lelo", error_wala_hello)

// Problems with callbacks
/*
	- Complete control of callback function to the lime-light function
	- Callback Hell aka Pyramid of Doom
	  This is when you have a callback inside a callback inside another callback and so on..
	  In this style of coding the code grows horizontally reducing the ability to read the code!
	  This is not a good practice.
*/
// Callback Hell aka Pyramid of Doom
loadScript("https://kahin.se.bhi.lelo", function loadScript(src, callback){
	let script = document.createElement('script')
	script.src=src
	script.onload=()=>{
		console.log("Script has been loaded successfully!")
		callback()
	}
	document.body.append(script)
	loadScript("https://kahin.se.bhi.lelo", function loadScript(src, callback){
		let script = document.createElement('script')
		script.src=src
		script.onload=()=>{
			console.log("Script has been loaded successfully!")
			callback()
		}
		document.body.append(script)
		loadScript("https://kahin.se.bhi.lelo", function loadScript(src, callback){
			let script = document.createElement('script')
			script.src=src
			script.onload=()=>{
				console.log("Script has been loaded successfully!")
				callback()
			}
			document.body.append(script)
			loadScript("https://kahin.se.bhi.lelo", function loadScript(src, callback){
				let script = document.createElement('script')
				script.src=src
				script.onload=()=>{
					console.log("Script has been loaded successfully!")
					callback()
				}
				document.body.append(script)
				loadScript("https://kahin.se.bhi.lelo", function loadScript(src, callback){
					let script = document.createElement('script')
					script.src=src
					script.onload=()=>{
						console.log("Script has been loaded successfully!")
						callback()
					}
					document.body.append(script)
				})
			})
		})
	})
})
