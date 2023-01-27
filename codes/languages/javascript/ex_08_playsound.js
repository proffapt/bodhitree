function play(){
	let audio = new Audio('./audio.mp3')
	audio.play()
}

play()
// Will only play after you interact with the page
/*
	This is a security measure.. otherwise if someone visits a website in class 
	and it starts playing porn audio.. that's gonna be a serious problem
*/
