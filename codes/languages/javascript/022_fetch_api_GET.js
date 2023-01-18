api="https://goweather.herokuapp.com/weather/NY"

let p = fetch(api) // p is a promise
// Fetching data from an API is a two step process
/*
	1. Getting the response
		-> Might give some error.
		>> Handled via the first .then()
	2. Converting it to json
		-> Might give some error.
		>> Handled via the second .then()
	3. Logging out the value

	This is JS way of handling such issues.. which were handled very elegantly by gonalg through its `, ok` syntax.
*/
p.then((response)=>{ // got the response
	console.log("HTTP status code :",response.status) // HTTP status code
	console.log("Is everything allright?", response.ok) // true if status code is between 200-299 (including both!) _ Basically if status code starts with `2`
	console.log("Header of the response :", response.headerl) // Response Headers
	return response.json() // converting into json format
	/*
	Only one conversion is allowed. If you try to do response.text() it will not work! (obviously after handling the return statement & making both operations equally important)
		*/
}).then(value=>{ // got the value
	console.log(value) // logging out the json data
}).catch((error)=>{
	console.log(error.name)
	console.log(error.message)
})
