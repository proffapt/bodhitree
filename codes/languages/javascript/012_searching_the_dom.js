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
