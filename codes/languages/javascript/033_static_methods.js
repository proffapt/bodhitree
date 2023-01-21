class Animal{
	constructor(name){
		// this.name=this.capitalize(name) // -> If capitalize is not static
		// this.name=Animal.capitalize(name) // -> Will work. POSTION 1
		// Static methods are accessible only via it's class only
		this.name=name // Will work when the capitalize function is called during the time you gave arguments
	}
	walk(){
		console.log(`${this.name} is walking.`)
	}
	// Has no relation with the objects - thus is not accessible via instances(objects) of this class
	static capitalize(name){
		return name.charAt(0).toUpperCase() + name.substr(1, name.length)
	}
}

// let jaggu = new Animal("jaggu")
let jaggu = new Animal(Animal.capitalize("jaggu")) // the method can be used outside of class as well.. but again via the class only
jaggu.walk()
// jaggu.capitalize("thiswon'twork") // -> This won't work
