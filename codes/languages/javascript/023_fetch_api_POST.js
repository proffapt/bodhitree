// Constructing the options object for fetch(url, options)
let options={
	method: "POST",
	headers: {
		"Content-type":"application/json"
	},
	body: JSON.stringify({ // Converting JSON formatted data to string
		"user":"proffapt",
		"secret":"pass123"
	}),
};

//// Via .then()
// let p=fetch('https://jsonplaceholder.typicode.com/posts', options).then((response)=>{
// 	return response.json()
// }).then((data)=>{
// 	console.log(data)
// })

/// Via async/await
// (async ()=>{
// 	let response = await fetch('https://jsonplaceholder.typicode.com/posts', options)
// 	let data = await response.json()
// 	console.log(data)
// })()

// async function getRequest(id){
// 	let response = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`)
// 	let data = await response.json()
// 	console.log("GOT :", data)
// }

// getRequest(5)

//// Doing exactly what we did above just in more controlled manner
async function postRequest(){
	let response = await fetch('https://jsonplaceholder.typicode.com/posts', options)
	let data = await response.json()
	return data
}

// Just more preferred syntax
const getRequest = async (id)=>{
	let response = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`)
	let data = await response.json()
	return data
}

(async ()=>{
	let sentData = await postRequest()	
	let gotData = await getRequest(55)

	console.log([sentData, gotData])
})()
