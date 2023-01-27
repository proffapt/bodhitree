// Here's how to import functions via common JS method

const sayHello = ()=>{
	console.log(`Hello, master`)
}

const advancedHello = (name)=>{
	console.log(`Hello, ${name}`)
}

// The common JS way, nothing else to do like as in ESmodule
// module.exports = sayHello // -> This is how you export a single function
module.exports = {sayHello, advancedHello}
