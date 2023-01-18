// Promise
/*
	- Solution to Callback Hell (Pyramid of Doom)
	- It is a promise of "execution of code" - doesn't matter successfully or unsuccessfully!
	  In both scenarios we will be notified
	- Also used for parallel execution
*/
let a=0
// No need to call the promise explicitly, when you assign its value via a function as argument it's already invoked
let promise = new Promise((resolve, reject)=>{ // let var = func(argument) // -> var will store the value of function
	if (a==1){
		resolve(69) // sets the state of promise as "fullfilled"
	}
	else if (a==0){
		reject(new Error("The value was 0"))
	}
	else{
		throw new ValueError("Value was invalid")
	}
})
// console.log(promise)
can't call promise properties..
// promise.then(()=>{
// 	console.log("Promise was fullfilled")
// }).catch((err)=>{
// 	console.log("Promise was rejected due to", err)
// })
// another alternative method
promise.then(()=>{
	console.log("Promise was fullfilled")
}, (err)=>{
	console.log("Promise was rejected due to", err)
})
// The syntax is: promise.then(fullfill_handler, error_handler)
