// ES6 modules
export const sayHello = ()=>{
	console.log(`Hello World`)
}

export const advancedHello = (name)=>{
	console.log(`Hello, ${name}`)
}

// With default you should not define. 
/*
	First define and then export via default

	## Won't work
	export default importWithoutDestructuring = ()=>{
		console.log(`I have used default. Hence, you are not forced to use destructuring to import me.`)
	}
*/
const importWithoutDestructuring = ()=>{
	console.log(`I have used default. Hence, you are not forced to use destructuring to import me.`)
}

export default importWithoutDestructuring
