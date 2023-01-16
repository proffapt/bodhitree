// console.log V/S console.dir
/*
	log -> Gives the exact element written in HTML
	dir -> Gives the element as an object with all of its properties

	<body>
		<div>Hello</div>
	</body>
*/
console.log(document.body.firstElementChild) // <div>Hello</div>
console.dir(document.body.firstElementChild) // div object with all of its properties
// tagName & nodeName
/*
	nodeName works for all type of nodes
	tagName works for Element nodes only
*/
console.log(document.body.firstChild.nodeName) // #text 
console.log(document.body.firstElementChild.nodeName) // div 
console.log(document.body.firstElementChild.tagName) // div 
//

// Populating innerHTML of a tag
/*
	Gets(& also sets) the content of HTML inside an ELEMENT NODE as a string

	<p class="paragraph"> This is the initial content.</p>
*/
let para = document.querySelector(".paragraph") 
console.log(para.innerHTML) // " This is the initial content"
para.innerHTML="<b>This is the new text</b>"
// outerHTML
/*
	Contains the full HTML

	innerHTML + the element itself = outerHTML
*/
let html = document.querySelector(".paragraph") 
console.log(html.outerHTML) // "<p class="paragraph"> This is the initial content.</p>"
html.outerHTML="<div><b>This is the new text</b></div>"
// What about nodes which other then element? **** NOTE
/*
	We utilise `data` or `nodeValue` properties of those nodes

	<body>
		Hello World
	</body>
*/
console.log(document.body.firstElementChild.nodeValue) 
console.log(document.body.firstElementChild.data) 
// Both gives "Hello World", without being a element node.. as it is a text node
console.log(document.body.textContent) // Gives only text, no tags.. nothing. OUTPUT: Hello World
document.body.hidden = true // Hides the whole body
