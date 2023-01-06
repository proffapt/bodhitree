let l = console.log

// Normal FOR-loop
for (let i=0; i<5; i++){
	l(i)
}

// FOR-IN loop
/*
	Iterates over keys for any type of datastructure which is not abstract.
	For example: Object - Array - String
*/
let myobj = {
	66: 99,
	55: 55,
	23: 90,
	34: 69
}
for (key in myobj) { // Again `()` are necessary.
	l(key)
}

let array = [1, 2, 3, 4, 5]
// FOR-OF loop
/*
	Iterates over valus for ITERABLE datastructures like - arrays and strings.

	It does NOT lets you iterate of object by default because Symbol.iterator is not there by-default.
*/
for (value of array) {
	l(value)
}

// Very obvious while and do-while loops.
