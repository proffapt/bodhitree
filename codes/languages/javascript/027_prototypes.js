let l=console.log
// Prototypes
/*
	JavaScript Objects have a prototype property. 
	It is either null or references other objects.

	So basically if the called property/method is their in the object's definition, it will be used directly (even if the prototype has same property/method but with different implementation)
	If it doesn't find the property/method in the object then it will try to search in its prototype.
	If there also it doesn't find.. ERROR
	This is called "Prototypal Inheritance"
*/
let obj={
	name: "proffapt",
	lang: "golang"
}
l(obj)

// obj.run() // -> Will give error. Obviously.

let prototype={
	run: ()=>{
		l("...Running...")
	},
	lang: "js" // will be overwritten by "golang"
}
// Setting prototype is done by setting the "__proto__" property of on object (referencing other object)
l(obj.__proto__) // first it is null
obj.__proto__ = prototype // now references other object 

obj.run()
l(obj.lang)

let another_prototype={
	sex: "nahi mila"
}
prototype.__proto__ = another_prototype 
// Chain of prototypes
// another_prototype -> prototype -> obj
l(obj.sex)
