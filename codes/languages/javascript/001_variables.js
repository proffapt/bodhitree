// Significance of Dynamically typed languages
/*
    Type of variables is assigned during the runtime
	If a variable was string once.. it can be integer later.. or whatever
*/

let x=69
console.log(x)
x="proffapt"
console.log(x)

// let 8b = 66 // -> var name can't start with a number
console.log("JS is case sensitive: Harry and harry are different as variables\n")

// LET, VAR & CONST
/*
	VAR: "depricated" - was used before ECMAscript(ES) 6 - can introduce bugs - GLOBALLY scoped - can be altered from anywhere
		How might it introduce bugs?
			- This piece of shit can let you redclare a variable...
	LET: used to declare block scoped variables - BLOCK scoped - can alter only inside its block
	CONST: to declare non-changing entities - BLOCK scoped

	*** Initialisation
	var & let is initilised with "undefined" by default.
	const are NOT initilised by default; you have to initialise it.

	**** Brahmastra
	- Always first use CONST
	- If you need to update the variable > change it to LET
	- NEVER use VAR
*/

var global = "That is a global variable"
var global = "This is a global variable" // redclaration is allowed everywhere - be it the same block or a diff block
let local = "That is a local variable with blocked scope"
// let local = "This is a local variable with blocked scope" // -> Can't redeclare
local = "This is a local variable with blocked scope" // Can be modified for obvious reasons
const author = "proffapt"
// author = "tullu" // -> Not allowed
console.log("Author of this code is:", author)
console.log("global in starting:", global)
console.log("local in starting:", local)

{
	var global = "Here I redeclared the global variable - short comming of var - and altered its value"
	let local = "This is a local variable with blocked scope - mind it that it's not redeclaration.. this exist only inside the block"

console.log("global inside block:", global)
console.log("local inside:", local)
}

console.log("global in end:", global)
console.log("local in end:", local)

// DATA TYPES
//Trick to remember them all
/*
	----- Primitive Datatypes -----
	N - null
	N - number
	S - symbol
	S - string
	B - boolean
	B - bigint
	U - undefined

	---- Non-Primitive Datatypes
	Object -> Key, Value pair.
*/
console.log("\nPrimitive Datatypes\n")
let a = null
let b = 878;
let c = BigInt("345")
let d = false
let e = "proffapt"
let f = Symbol("This is a symbol")
let g = undefined
let h // Means the same as above
console.log(a, b , c, d, e, f, g, h)
console.log(typeof a, typeof b, typeof c, typeof d, typeof e, typeof f, typeof g, typeof h)

console.log("\nNon-Primitive Datatypes\n")
// Object in java == dict in python == map in go == arraylist in java
const item = {
	"sex": "male",
	"virgin": true
}
console.log(item, item["sex"], item.virgin, item["hai hi nahi"]) // something which is not a key will return undefined
// Can access the elements either via `item["sex"] OR item.sex`
/*
	Some words about objects.
	- The name which we use to refer object in the memory is actually a reference.
	- So, when reference is a CONST, you can't change the type of reference to some other primitive or abstract data type.
	- But modifying that object is allowed, because we are just modifying the memory not changing the memory

	Example
	const a = 5 -> a here is not a reference.. aka not a pointer.
	a = 6

	const a = {sex: "male", virgin: true} -> a here is a reference to the memory where this object is created... aka pointer.
	a['horny'] = "always" -> allowed because we modified the memory right there!
	a = {} -> Not allowed coz again assigning a new object in different part of memory.
*/
item['horny'] = "always"
l = console.log // An idea to reduce boilerplate code.. haha
l(item)
