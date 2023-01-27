// Resources
/*
	https://regexr.com
*/
const string = "Proffapt is a very very awesome nice very boy."
console.log(string.replace('very', 'VERY')) // Will replace only the first occurance
// Regular Expressions
const regex = /very/g // Select very globally (all occurances)
console.log(string.replace(regex, 'VERY')) // Will replace every occurance
