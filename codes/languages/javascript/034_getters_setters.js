class Animal{
	constructor(name){
		this.name=name 
		// Will still work without using `_name` 
		// Both are valid, this._name and this.name
	}
	fly(){
		console.log(`Main udd raha hun`)
	}
	// Setter
	set name(name){
		// Using `_name` instead of `name` to avoid conflict between method and property
		this._name=name
		/*
			Must use a different name inside the getter and setter

			this.name can be used outside these getters and setters
			will invoke the required properties only.
		*/
	}
	get name(){
		return this._name
	}
	// Name of these methods will be used as a property while invoking!
}

class Rabbit extends Animal{
	eatCarrot(){
		console.log(`Eating Carrot`)
	}
}

// let ani=new Animal // -> Works without `()` as well
let ani=new Animal("Baggu")
console.log(ani.name)
ani.fly()
// Using the setter
ani.name = "Jaggu"
// Using the getter
console.log(ani.name)

// instanceof
let pinku = new Rabbit
pinku.eatCarrot()
/*
	Gives true when the object is an instance of the class of interest.

	Even if the object is of a class which is inherited from another class,
	then that object is instance of both of those classes and will return true
	for both of them.
*/
console.log(`Is "pinku" an object of class animal?: ${pinku instanceof Animal}`)
console.log(`Is "pinku" an object of class rabbit?: ${pinku instanceof Rabbit}`)
console.log(`Is "ani" an object of class Animal?: ${ani instanceof Animal}`)
console.log(`Is "ani" an object of class rabbit?: ${ani instanceof Rabbit}`)
