// To get all the cookies on the current page.
console.log(document.cookie) // key=value pairs separated by a `;`
/*
	If a web server want to store cookies on a browser it will send a `Set-Cookie` HTTP Header in the response.
	Next time the browser tries to communicate to the same domain it will send `Cookie` field in HTTP Header of the request, identifying the particular client to the server.
*/

// Setting a cookie
document.cookie="test=123"
/*
	Write operation doesn't touch other cookies

	Syntax seems likes resetting all the cookies to this particular value.
	NO! all the cookies remain intact.. this key=value pair is just added on top of them.
*/
console.log(document.cookie) // "test=123"
// If the key is same then only cookie is over-written(updated) with the new value
document.cookie="test=6969"
console.log(document.cookie) // "test=6969"

// For using special characters in key or value we use - encodeURIComponent
let key=encodeURIComponent('akljdfak$;lsjdf')
let value=encodeURIComponent('a#ljdfak$;*sjdf')
document.cookie=`${key}=${value}`
// Decoded via decodeURIComponent
console.log(decodeURIComponent(key), decodeURIComponent(value))

// Cookie Options
document.cookie="user=proffapt; path=/a; expires=insert{date+time}"
/*
	The above statemen is called a `Set call`
	In a set call if entries are separated by ; it doesn't mean these are multiple cookie entries rather they are opions for a single cookie.
	1 set call = 1 cookie

	Path: Makes the cookie available for a paricularly sudir and its further subdirs.
	Expires: Sets the expiration time for the cookie
*/

// NOTE
/*
	- The size of name=value pair after encodeURIComponent, should not exceed 4Kb.
	- Total number of cookies per domain = 20+{depends on browser} i.e. atleast 20
*/
