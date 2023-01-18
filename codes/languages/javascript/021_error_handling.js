console.log("START")
// Try-catch empowers the script to not to die when an error occurs
try{
	console.log(test)
}
catch(error){
	// console.log(error) // -> Gives the exact error object/content/details
	console.log("ERROR")
}
console.log("END 1") // Other wise any code from this line would never run.
// ******* IMPORTANT *********
/*
	try-catch block will not handle any error
	which occurs in scheduled code, say, setTimeout

	try only handles SYNCHRONOUS code!
*/
// try{
// 	setTimeout(()=>{
// 		console.log(test)
// 	}, 1)
// } catch {
// 	console.log("Ye catch nahi hoga")
// }
// console.log("END 2") // This will run because of scheduling of the code to be tried.. but the error inside it won't be caught!
/*
	Why?
	For try it was like.. schedule this code after 2 seconds and it said ok :shrug
	This was a success for try block.. later if the scheduled code encounters error, it won't be its responsibility of try block to handle it.

	Then How to handle it?
*/
setTimeout(()=>{
	try {
	console.log(test)
	}catch {
		console.log("Ye iss baar catch hoga")
	}
}, 1)
console.log("END 2") // This will run because of scheduling of the code to be tried.. but the error inside it won't be caught!

//// Throwing Custom Error
try {
	throw new Error("This is a custom error")
} catch(error){
	// console.log(error)
	// All bultin errors always have two main properties
	console.log("Name of error :", error.name) // Type of error
	console.log("Message body of error :", error.message) // main message
	// There might be a 3rd property, but it depends
	console.log("Stack of error :", error.stack) // Details about the error: What? Why? Where?
}

//// The FINALLY block
/*
	Executes at any cost
		- If no error in try or catch
		- If some error OR CATCH
		- Even if the function returned
*/
try {
	// let a=69
	// console.log(a)
	(()=>{
		// let a=69
		console.log(a)
		// finally will be executed just before returning - right here
		return a
	})()
} catch {
	console.log(b)
	console.log("Error aya")
} finally {
	console.log("This will always execute")
	// Close a file
	// Close a connection
	// Write to the log file
}
