// Table provides extra features for navigation within them.
/*
	<body>	
		<div>
			<table class="table">
				....
			</table>
		</div>
	</body>
*/
let t=document.body.firstElementChild.firstElementChild
console.log(t.rows) // Gives a collection of rows (need to convert to arrays to be able to apply array operations)
console.log(t.caption) // Gives the caption assigned for the table
console.log(t.tHead) // Gives the tHead assigned for the table
console.log(t.tFoot) // Gives the tFoot assigned for the table
console.log(t.tBodies) // Collection of tBodies element
console.log(t.tBodies.rows) // Collection rows inside of tBodies element
let tr=t.rows[0]
console.log(tr.cells) // Collection of td and th
console.log(tr.sectionRowIndex) // Index of tr inside enclosing element
console.log(tr.rowIndex) // Row numbers, starting from 0
