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
	Siblings: Elements on the same level with each other
	Child Nodes: Directly related elements
	Descendent Nodes: All nested elements, children.. their children and so on.. 
					  (Basically directly and deeply - both ways connected elements)
*/
