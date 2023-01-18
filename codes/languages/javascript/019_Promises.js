// Promise
/*
	- Solution to Callback Hell (Pyramid of Doom)
	- It is a promise of "execution of code" - doesn't matter successfully or unsuccessfully!
	  In both scenarios we will be notified
	- Also used for "controlled & notified" parallel execution
	  JS has asynchronous nature, but as soon as some task is done.. some other task is triggered.. How will you do that?
	  this is where .then() & .catch() - hence promise come useful.
	  otherwise kab hogaya pata hi nahi chalega.. ussi ke liye callback functions ka concept aya tha, but
	  usmein ek syntax based issue tha "callback hell/pyramid of doom" ke naam se..
	  proise ka better version.. async/await hai!
*/
let a=1
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
console.log(promise)
/*
	Can't call promise properties explicitly.. ONLY visible via browser console
		state - pending to fullfilled/rejected
		result - Undefined to Value/Error
*/
promise.then(()=>{
	console.log("Promise was fullfilled")
}).catch((err)=>{
	console.log("Promise was rejected due to", err)
})

//// another alternative method
promise.then(()=>{
	console.log("Promise was fullfilled")
}, (err)=>{
	console.log("Promise was rejected due to", err)
})
// The syntax is: promise.then(fullfill_handler, error_handler) - Similar order as that of .then() .catch() syntax

//// yet another alternative method
promise.then(()=>{
	console.log("Promise was fullfilled")
})
/*
	Following is equivalent to:

	promise.then(null, (err)=>{
		console.log("Promise was rejected due to", err)
	})
*/
promise.catch((err)=>{
	console.log("Promise was rejected due to", err)
})
// Misc
promise.then(console.log) // then needed a function right? we provided alert() function's reference

//// Promise chaining
// This is how we solve the "callback hell"
promise.then((value)=>{
	console.log(value)
	return new Promise((resolve, reject)=>{
		resolve("another promise")
	})
}).then((value)=>{
	console.log(value)
	return new Promise((resolve, reject)=>{
		resolve("yet another promise")
	})
}).then((value)=>{
	console.log(value)
	return new Promise((resolve, reject)=>{
		reject("rejection!")
	})
}).then((value)=>{
	console.log(value)
	return new Promise((resolve, reject)=>{
		reject("another rejection!")
	})
}).then((value)=>{
	console.log(value)
	return new Promise((resolve, reject)=>{
		resolve("yet another promise")
	})
// This catch will catch the very first rejection & stop breaks the chain but rest of the code continues as it is obviously in asynchronous manner.
}).catch((error)=>{
	console.log(error)
})
console.log("I am still accessible")

//// Attaching Multiple Handlers
promise.then((value)=>{
	console.log("first .then", value)
})
promise.then((value)=>{
	console.log("second .then", value)
})

//// Promise API
let p1 = new Promise((resolve, reject)=>{ 
	setTimeout(()=>{
		// resolve("1 Second")
		reject(new Error("This is for Promise.race"))
	}, 1000)
})
let p2 = new Promise((resolve, reject)=>{ 
	setTimeout(()=>{
		// resolve("2 Second")
		reject(new Error("This will result in Promise.all to throw this only.. other values will be ignored"))
	}, 2000)
})
let p3 = new Promise((resolve, reject)=>{ 
	setTimeout(()=>{
		resolve("3 Second")
	}, 3000)
})
// 1. Print only when all the promisies are RESOLVED
let ap = Promise.all([p1, p2, p3])
ap.then(value=>{
	console.log(value) 
	/*
		Prints 1, 2, 3 resolved values after 3 seconds. Why?
		It prints everything at the same time. When?
		When all are resolved

		Won't work when any of the promise rejects, we would have to catch it explicitly.
	*/
})
// 2. Print complete object even if some promise is REJECTED
let aps = Promise.allSettled([p1, p2, p3])
aps.then(value=>{
	console.log(value) 
})
// 3. Print the first promise to COMPLETE
let r = Promise.race([p1, p2, p3])
r.then(value=>{
	console.log(value)
})
// 4. Print the first promise to RESOLVE
let any = Promise.any([p1, p2, p3])
any.then(value=>{
	console.log(value)
})
// Modify promise like you own it
p1=Promise.resolve(6)
p1.then(value=>{
	console.log(value)
})
