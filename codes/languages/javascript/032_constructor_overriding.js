class Employee{
	constructor(name){
		console.log(`${name} - Employee's constructor is here`)
	}
	reqLeaves(x){
		console.log(`Employee has requested ${x} leaves`)
	}
}

// Method overriding
class Programmer extends Employee{
	/*
		When you don't create a constructor JS engine creates the following constructor for you
	*/
	// constructor(...args){
	// 	super(...args)
	// }
	constructor(name){
		// this.name // Before super; will give error
		console.log(`${name} - Programmer's constructor is here`)
		super(name) // -> Will work fine
		/*
			Must call super constructor in derived class before accessing 'this' or returning from derived constructor
		*/
		this.name // After super; will work
	}
	reqCoffee(x){
		console.log(`Employee has requested ${x} coffees`)
	}
	reqLeaves(x){
		console.log(`Employee has requested ${x+1} leaves (One extra) - Auto Approved`)
	}
}

let p = new Programmer("proffapt")
p.reqLeaves(6)
