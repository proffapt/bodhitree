const l = console.log

// Repetitive code after a set time
setInterval(()=>{
	// const date= new Date().toLocaleDateString()
	const date= new Date().toDateString()
	const time= new Date().toLocaleTimeString()
	// const time= new Date().toTimeString()
	console.clear()
	l(date)
	l(time)
}, 1000)
