document.getElementById("id-of-the-element") // Returns the element having specified id (id is unique)
document.getElementsByClassName("suck-class") // Returns an array of elements with specified class
// For selecting via CSS selectors
// Selects every element and puts into an array
document.querySelectorAll(".class-name")
document.querySelectorAll("#id-name")
// For selecting the very first element (efficient version of .querySelectorAll("...")[0])
document.querySelector(".class-name")
document.getElementsByTagName("div") // gets all the elements with a particular tag
// the letter "s"
/*
	getEelemnt`s`ByClassName -> array of elements with same class
	getElementById -> first element of the group
*/
document.getElementsByName("name-tag")

// matches, closest & contains
/*
	<div class="box" id="id1">This is element 1 <span id="sp1">This is a span</span></div>
	<div class="box" id="id2">This is element 2</div>
*/
let elem1=document.getElementById("id1")
let elem2=document.getElementById("id2")
let span1=document.getElementById("sp1")
console.log(elem1.matches(".class-name")) // will return False.
console.log(elem1.matches(".box")) // Will return TRUE as elem1 has a class of box
/*
	Works only for CSS selectors:
		.class
		#id
*/

span1.closest(".box") // returns the elemen 1
/*
	How does it work?
	First it will check whether the element itself has the specified CSS selector or not
	Then it will check for its parent otherwise.. and so on..
*/
console.log(elem1.contains(sp1)) // True
console.log(sp1.contains(sp1)) // True
console.log(sp1.contains(elem1)) // False
