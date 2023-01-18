/*
	What?
		This is a special syntax to work with promises without .then()

	Why?
		To save us from ".then() well" (XD I made the term)
		JS is ulta mindset generally other programming langs wait for the process to complete.. and if we want to not to wait then we do some special unga bunga
		But JS doesn't wait by default.. here, if we want to wait then we have to do some specail unga bunga
*/

// Async Functions
/*
	- Any function can be made async via the "async" keyword.
	- It always returns a promise
	- If you don't use "resolve" or "reject" instead you used "return" then this will be wrapped as a promise by JavaScript
*/
// function myfunc(){ // -> .then() can't be used with it
async function myfunc(){
	return 69
}
myfunc().then(console.log)

// Await - Why async functions exist
/*
	- Await can only be used inside an async function
	- The thing being awaited MUST be a Promise! The value of which will be stored in the variable

	# Syntax
	let value = await promise
*/
let delhiWeather = new Promise((resolve, reject)=>{
	setTimeout(()=>{
		resolve("27")
	}, 7000)
})
let bangloreWeather = new Promise((resolve, reject)=>{
	setTimeout(()=>{
		resolve("21")
	}, 3000)
})
// delhiWeather.then((w)=>{
// 	console.log("Temperature of Delhi :", w)
// })
// bangloreWeather.then((w)=>{
// 	console.log("Temperature of Banglore :", w)
// })
///// BUUTT, you wanted temp of Delhi first then Banglore. How to handle?

async function weatherControlRoom(){
	console.log("Fetching Delhi Data ...")
	let dw = await delhiWeather // waits for the process to complete
	console.log("Fetched Delhi Data.")
	console.log("Temperature of Delhi :", dw)

	console.log("Fetching Banglore Data ...")
	let bw = await bangloreWeather // waits for the process to complete
	console.log("Fetched Banglore Data.")
	console.log("Temperature of Banglore :", bw)

	return [dw, bw]
}

let weatherReport = weatherControlRoom()
console.log(weatherReport); // To see the proper results check in browser console

// *** All the async functions are executed parallely!
(async ()=>{
	console.log("This function is running parallely and doesn't wait for await inside another function")
})()
console.log("Neither does other code lines wait for awaits inside another function.. it is on a different thread")
// Only async function ke andar jahan jahan await hai wahan wahan rukte rukate kaam hoga!
