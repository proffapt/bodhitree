// Local Storage
/*
	It is a web storage object.
	
	How are they different from cookies?
		- Are not sent to the server with every request.
		- Survives a full refresh, reload & restart of browser.
*/

// Methods of localstorage
localstorage.setItem("proff", "6969") // Sets key value pair
localstorage.getItem("proff") // returns value="6969" for the corresponding key="proff"
localstorage.removeItem("proff") // removes the item wih key="proff"
localstorage.clear() // clears all the storage.
// Updating the value of a particular key
// Just set that key with another value directly
localstorage.setItem("proff", "9696") // Initial value
localstorage.setItem("proff", "6969") // Final value
localstorage.setItem("apt", "69") 
localstorage.setItem("jk", "969") 
localstorage.setItem("js", "699") 
console.log(localstorage.length) // Gives the length: 4 in this case
// localstorage.key(index) -> key at a particular index
localstorage.key(0) // Gives "proff"
localstorage.key(1) // Gives "apt"
localstorage.key(2) // Gives "jk"
localstorage.key(3) // Gives "js"

// The object syntax
localstorage.proff=1
console.log(localstorage.proff)
delete localstorage.one

// NOTE
/*
	- Both key and value must be string
	JSON.Stingify(object) : JS Object -> JSON String
	JSON.parse(string) : JSON String -> JS Object
*/
