/*
	<div class="meri-class ek-aur-class" name="mera-element">hehe</div>
*/
let e=document.getElementsByName("mera-element")
console.log(e.getAttribute("class")) // "meri-class ek-aur-class"
// Special method for getting classes in an array
console.log(e.classList) // ["meri-class ek-aur-class"]
//
console.log(e.hasAttribute("data-player")) // false
console.log(e.hasAttribute("class")) // true
e.setAttribute("class", "new-class")
console.log(e.getAttribute("class")) // new-class
console.log(e.hasAttribute("name")) // true
e.removeAttribute("name")
console.log(e.hasAttribute("name")) // false
console.log(e.attributes) // Gives an object(collection) containing all the attributes for the element
// data-* attributes
/*
	You can create a custom attribute, say, player - but what if ECMAscript also creates it in future? It will break your code
	To prevent that js has given `data-*` attributes.. for your custom attributes, say, data-player
	
	<div class="meri-class ek-aur-class" name="mera-element" data-game="mario" data-player="proffapt">hehe</div>
*/
console.log(e.dataset) // gives all attributes of format data-* : game, player
// For accessing one of the custom attribute
console.log(e.dataset.player) // proffapt

// Classes
e.className="red black tree"
console.log(e.classList) // "red black tree"
e.classList.remove("black")
console.log(e.classList) // "red tree"
e.classList.add("black")
console.log(e.classList) // "red black tree"
e.classList.toggle("tree")
console.log(e.classList) // "red black"
console.log(e.classList.contains("tree")) // false
e.classList.toggle("tree")
console.log(e.classList) // "red black tree"
console.log(e.classList.contains("tree")) // true
