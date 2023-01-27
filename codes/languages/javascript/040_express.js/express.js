const express = require(`express`)
const app = express()
const port = 6969
const path = require(`path`)

app.get('/', (req, res)=>{
	res.send('Hello, world')	
})

// To serve a file
app.get('/about', (req, res)=>{
	// path.join, joins the root directory's absolute path with specified path
	res.sendFile(path.join(__dirname, './about.html'))
	// __dirname is path of current dir
})

app.listen(port, "localhost", ()=>{
	console.log(`Hello world application in express.js`)
})
