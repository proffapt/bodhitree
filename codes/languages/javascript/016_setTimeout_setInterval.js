// setTimeout
/*
	delays the execution of function by that much miliseconds
*/
let id = setTimeout((a, b)=>{
	console.log("YAY! 2 second hogaye.")
	console.log(a, b)
}, 2000, "here we can give argument to the function", "as well")
console.log(id) // returns the id of the timer.. can be used to cancle it before it even executes
clearTimeout(id) // will stop the delayed task.. and will never happen
// setInterval
/*
	- Exact syntax as that of setTimeout
	- Just the delay is repetitive.. the function will be executed repeatetively after that delay..
*/
let timerid = setInterval( (a, b)=>{
	console.log("YAY! 5 second hogaye.")
	console.log(a, b)
}, 5000, "arg1", "arg2")
// clearInterval(timerid)
