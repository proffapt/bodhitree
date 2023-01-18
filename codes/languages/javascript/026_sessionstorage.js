// Session Storage
/*
	- Used less oftenly as compared with localsorage.
	- Properties & Methods are same as that of LocalStorage.
	- Exist only in the curren tab, opening a new tab with same domain will not have that session storage
	
	- Survives
		* Refreshing the current tab
	- Doesn't Survive
		* Tab reopen
		* Another tab along with this one
		* Browser Restart

	"Only for the current tab. This tab dies; storage dies"
*/

// Storage Event
/*
	Storage events are triggered when localstorage or sessionstorage are updated.

	With following properties:
		- key
		- oldValue
		- newValue
		- url
		- StorageArea
*/
window.onstorage((e)=>{
	console.log(e)
})
// Above code listens for updation of value of already present keys..
