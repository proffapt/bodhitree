// Modules are of two types in JS
/*
	- Common JS modules 
	- ES6 Modules
*/

// CommonJS modules
/*
	### Importing a Single function

	const sayHello = require('./commonjsmodule.js')
	const sayHello = require('./commonjsmodule')

	Both work - with & without `.js`

 	### Importing multiple functions
	##### Without Destructuring

	const commonjs = require('./commonjsmodule.js')
	commonjs.sayHello()
	commonjs.advancedHello('proffapt')

	##### With Destructuring

	const {sayHello, advancedHello} = require('./commonjsmodule.js')
	sayHello()
	advancedHello('proffapt')
*/

// ES6 Modules - Recommended
/*
	For this to work, you must add an entry
	`
	  "type": "module",
	`
	in package.json

	NOTE
	- Must use `.js`, otherwise won't work
	- Must use the method of destructuring, if not set the `default keyword`
*/
import importWithoutDestructuring, {sayHello, advancedHello} from './es6module.js'
// import sayHello from './es6module' // Won't work
sayHello()
advancedHello('proffapt')
importWithoutDestructuring()
