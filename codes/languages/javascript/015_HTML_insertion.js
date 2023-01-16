// Methods of insertion!
let e=document.getElementsByClassName("container")
/*
	<span class="container">
		<div id="first">This is the first element.</div>
		<div id="second">This is the second element.</div>
	</span>
*/

// Method 1 : Intuitive using innerHTML
e.innerHTML = e.innerHTML + "This will be added"
/* RESULT
	<span class="container">
		<div id="first">This is the first element.</div>
		<div id="second">This is the second element.</div>
		This will be added
	</span>
*/

// Method 2
let div = document.createElement("div") // creates div
div.className="myclass"
div.innerHTML="Append"
e.append(div)
div.innerHTML="Prepend"
e.prepend(div)
div.innerHTML="before"
e.before(div)
div.innerHTML="after"
e.after(div)
/* RESULT
	<div class="myclass">before</div>
	<span class="container">
		<div class="myclass">Prepend</div>
		<div id="first">This is the first element.</div>
		<div id="second">This is the second element.</div>
		This will be added
		<div class="myclass">Append</div>
	</span>
	<div class="myclass">after</div>
*/
div.innerHTML="Replacing the whole span"
div.id=1
e.replaceWith(div)
/* RESULT
	<div class="myclass">before</div>
	<div class="myclass" id=1>Replacing the whole span</div>
	<div class="myclass">after</div>
*/

// Method 3
/*
	<span class="container">
		<div id="first">This is the first element.</div>
		<div id="second">This is the second element.</div>
	</span>
*/
e.insertAdjacentElement('beforeend', "Before End")
e.insertAdjacentElement('afterend', "After End")
e.insertAdjacentElement('beforebegin', "Before Begin")
e.insertAdjacentElement('afterbegin', "After Begin")
/* RESULT
	<div>Before Begin</div>
	<span class="container">
		<div>After Begin</div>
		<div id="first">This is the first element.</div>
		<div id="second">This is the second element.</div>
		<div>Before End</div>
	</span>
	<div>After End</div>
*/
// Node removal
e.remove()
