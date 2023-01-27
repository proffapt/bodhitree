const prompt = require("prompt-sync")()

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

l=console.log
let num = Math.floor(Math.random()*100)+1 // HOW?
/*
	Math.random() generates random number between 0&1
	*100 gets it from 0&100
	Math.floor converts to integers 0 to 99
	+1 gets it from 1 to 100
*/
let guess, count=0;

(async ()=>{
	do{
		guess = prompt("Guess the number: ")
		if (guess<num){
			l("Your guess is less than the original number")
			await sleep(1000)
		} 
		else if (guess>num) {
			l("Your guess is greater than the original number")
			await sleep(1000)
		}
		else {
			l("CORRECT!\nYou finally guessed the number!\nYour score is:", 101-count)
			break
		}
		count++
		console.clear()
	} while(guess != num)
})();
