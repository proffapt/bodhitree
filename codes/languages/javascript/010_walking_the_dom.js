// DOM tree
/*
	It refers to the whole HTML page where each node is a element(object) of HTML document
	HTML
	 |
	 ---- head ...
	 |
	 ---- body ... 
	Looks like tree, doesn't it?

	There are mainly three kind of nodes:
	1. Text node
	2. Element node
	3. Comment node
	<--! This is a comment node -->
	<this is element node> Stuff right here refers to the text node </this was an element node>

	* A text node is always a leaf of the tree; isn't it obvious?
*/
// Auto-correction
/*
	As the name suggests; browser tries to correct any erraneous HTML code.. like 
	- It will try to correctly close an incorrectly closed tag.
	- if we put something after the body, it is automatically placed inside the body.

	View Page Source V/S Inspect Element:
		View Page Source - Has the exact HTML code which was written by the creator. Without any Auto-corrections
		Inspect Element - Has the code which is being rendered! With all the Auto-Corrections
*/
// Walking the DOM
document.documentElement // Will return the HTML tag
document.body // Will return the body tag
/*
If you write the above statement before the body tag it will return: null
That's why it's better to put it in the very end of the HTML document
*//
document.head // Will return the head tag
// NOTE
document.title // Will return the title `string`

// Children, Sibling & Parent
/*
	Siblings: Elements on the same level with each other.
		Next Sibling == Right Sibling == Body is next sibling of head
		Previous Sibling == Left Sibling == Head is previous sibling of body
	Child Nodes: Directly related elements
	Descendent Nodes: All nested elements, children.. their children and so on.. 
					  (Basically directly and deeply - both ways connected elements)
*/
let ele=document.body
ele.firstChild // Gives the very first children(Can be a node or an element) to the parent element
ele.firstElementChild // Gives the very first children ELEMENT to the parent element
ele.lastChild // Gives the very last children(Can be a NODE or an ELEMENT) to the parent element
ele.nextSibling // To get the very next Sibling (Can be a NODE or an ELEMENT)
ele.previousSibling // To get the just previous Sibling
ele.nextElementSibling // To get the just next Sibling which is an element
ele.parentNode // Gives the parent(can be node or element both) of the element
ele.parentElement // Gives only the parent which is an element (aka element node)
// NOTE
/*
	<body>
		<div></div>
	</body>
	Here the first child will be a "text element" NOT the "div element" because after body there is a "space" 
	which is considered as an element in itself.. hence text element

	<body><div></div>
	</body>
	Here he first child will be div

	How to solve this issue? - Use firstElementChild & similar other alternatives
*/
ele.childNodes // Gives a NODELIST or he correct term is COLLECTION of all the child elements to a parent
// To use array operation on this
arrOfChildren = Array.from(ele.childNodes)
arrOfNodeChildren = Array.from(ele.childElementNodes)
// OR
arrOfNodeChildren = Array.from(ele.children)
// *.childElementNodes == .children
ele.hasChildNodes() // Returns true if the element is a parent element
// $0, $1, $2 & so on...
/*
	$0: It is the selected element in the debugger tool of browser, 
	using $0 in console will expand it and we can use it without hastle. 

	$1: It is he previously selected element in the debugger tool,
	using $1 in console will expand it and we can use it easily.
	and so on...
*/
// Properties of DOM collection
/*
	- Read only.
	- They are life (Changes are immediately reflected).
	- They are iterable using for-of loop
*/
