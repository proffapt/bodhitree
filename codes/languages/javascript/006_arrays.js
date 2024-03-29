l=console.log
let arr = [1, 2, 3, null, "sex"]
console.log("The array named 'arr' is:", arr)
console.log("Element at 4th index:", arr[5]) // No out of bound error! Instead gives undefined
arr[0] = 69 // Mutable
console.log("The array named 'arr' is:", arr)
console.log("Type of arr:", typeof arr)

// Array Methods
/// toString()
let tostring = arr.toString() // Doesn't modify the array
l(arr, tostring, typeof tostring)
/// join()
let joining_with_some_char = arr.join("_") // Doesn't modify the array
l(arr, joining_with_some_char, typeof joining_with_some_char)
// Pop and shift
/*
	All four of them modifies the array on being operated.
	
	Pop: removes the last element ___ Push: adds an element in the end
	Shift: removes the first element ___ Unshift: adds an element in the beginning
*/
/// pop()
let element = arr.pop()
l(element, arr)
/// push()
let length_of_new_array = arr.push("sex")
l(length_of_new_array, arr)
/// shift()
element = arr.shift()
l(element, arr)
/// unshift()
length_of_new_array = arr.unshift(69)
l(length_of_new_array, arr)
/// concat() - can take multiple arguments for concatenation
let yaa = [2, 1, 3, 5, 11, 6, 7, 8, 4]
l(yaa)
let yyaa = yaa.concat(arr) // Doesn't modify the array
l(yyaa)
/// sort()
yaa.sort() // modifies original array
l(yaa)
/*
	It does alphabetic sorting NOT numeric sorting!
	thus we got 1, 11, 2... i.e. 1 se shuru hone wale fir 2 se shuru hone wale and so on...

	For it to do sorting in ascending or descending order, you have to implement a COMPARE FUNCTION

	For a COMPARE FUNCTION with A & B as arguments and return values as:
		negative - A appears before B :- A, B
		0 - A and B have the same sort order :- A B
		positive - A appears after B :- B, A
	*/
yaa.sort((a,b)=>{
	return a - b
})
l("Sorting in ascending order :", yaa)
yaa.sort((a,b)=>{
	return b - a
})
l("Sorting in descending order :", yaa)
// reverse
yaa.reverse() // modfies the original array
l(yaa)
// Splice & Slice
/*
	Splice: (from which index to remove, how many to remove, what to add in place of removed entries...)
		- Modifies the array.
		- returns array of removed entries.

	Slice: You already know what it is.
		- Creates a new array.
*/
let copy_of_yaa = yaa
let removed_entries = yaa.splice(2, 3, 88, 78)
l("removed_entries =", removed_entries, 'new array =', yaa)
let yyyaa = yyaa.slice(2,6)
l(yyyaa) // wahi purana [2, 6)
// delete - keyword
delete yyyaa // doesn't work
l(yyyaa, "- Oops deleting whole array don't work! length of array =", yyyaa.length)
delete yyyaa[0] // will make the first element undefined
l(yyyaa, "- Deleting a value at an index works, but the length is not affected =", yyyaa.length)
// From
/*
	It converts an object of other kind to array
*/
let str = 'proffapt'
l(str, '->', Array.from(str)) // Creates an array

// Looops & arrays.
//// Using classic for loop is obvious

//// ForEach loop
yaa.forEach((element, index, array)=>{ // Takes in a function as argument
	l(element*element, index, array)
})

//// For in (KIA - key in array)
for (key in yaa) {
	l(key)
}

//// For of (value of array)
for (value of yaa) {
	l(value)
}

test_array = [1, 2, 3]
//// map: creates a new array with altered entries!
let yata = test_array.map((value, index, array)=>{ // NOTE: here value comes before index
	l("value=", value, "index=", index, "whole_array=", array)
	return value*index // MAP must return (it operates on every element and stores it according to the return statement into a NEW array)
})
l(yata)

//// filter: creates a new array operating only on those elements which satisfy a condition
let fata = test_array.filter((a)=>{
	return a*0.4<1
}) // Whenever filter function returns true while operaing on particular index, we get the corresponding ORIGINAL value
l(fata)

//// reduce: reduces an array into a single value based upon a reduce function
let array_sum = test_array.reduce((a, b)=>{
	return a + b
})
l(array_sum)
