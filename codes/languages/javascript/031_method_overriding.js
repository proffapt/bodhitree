class Employee{
	login(){
		console.log(`Employee has logged in`)
	}
	logout(){
		console.log(`Employee has logged out`)
	}
	reqLeaves(x){
		console.log(`Employee has requested ${x} leaves`)
	}
}

// Method overriding
class Programmer extends Employee{
	reqCoffee(x){
		console.log(`Employee has requested ${x} coffees`)
	}
	// Programmer is important.. he gets more than what he demands
	reqLeaves(x){
		// console.log(`Employee has requested ${x+1} leaves (One extra)`)
		console.log(`Employee has requested ${x+1} leaves (One extra) - Auto Approved`) // To show the importance of super keyword.
		// We can call the exact method.. without copying the contents into a child class
	}
	/*
		If the child class has a same method as that of parent class.
		Then it means it is explicitly changed.. for some reason..
		So the method of child will be prioritised aka will override that of parent
	*/
}

let p = new Programmer()
p.login()
p.reqLeaves(6)

// Super keyword
class DataScientist extends Employee{
	reqLeaves(x){
		super.reqLeaves(x)
		/*
			used to call the function of parent class.
		*/
		console.log(`Ek leave kam milegi.. 3 din kaam par nahi aya wese bhi`)
		console.log(`Leaves : ${x-1}`)
	}	
}

let ds = new DataScientist()
ds.reqLeaves(6)
