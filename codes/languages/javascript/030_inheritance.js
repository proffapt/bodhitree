// NEED?
/*
	Say you have a class for animals.
	Now you want to create multiple human objects.
	If you start modifying those things in animal everytime you create human object gonna be fucked up

	So you inherit a human class from animals class 
	And then using human class you create human objects, which will require less configuration
*/
class Animal{
	constructor(name, color){
		this.name=name
		this.color=color
	}
	run(){
		console.log(this.name+" is running.")
	}
	shout(){
		console.log(this.name+" is shouting.")
	}
}

// We need every property of animal + eat banana characteristics
class Monkey extends Animal{
	eatBanana(){
		console.log(this.name+" is eating banana.")
	}
}

let jaggu = new Monkey("jaggu", "blue")
jaggu.eatBanana() // From monkey class
jaggu.run() // From animal class
