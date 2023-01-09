// STRINGS ARE IMMUTABLE !!!
l=console.log;

let name="arpit"; // using double-quotes -> Usage is depricated
name[3]='q' // Won't work NEITHER will it throw any error
let uname='proffapt'; // using single-quotes
l(name, uname, name[0], uname[0], uname[1], name.length, uname.length);

// Template Literals
let some_sentence=`In this part you can use "double quotes" as well as 'single quotes'`
l(some_sentence)
let sentence=`${name} has a username of ${uname}` // variable substitution is supported - via string interpolation!
l(sentence)

// Methods of String
l("Length of 'proffapt' : ", uname.length) // Property w/o "()"
l("To uppercase : ", uname.toUpperCase()) // A method being operated hence with "()"
l("To uppercase : ", uname.toLowerCase()) // A method being operated hence with "()"
//// Slicing
l("proffapt[2,5) == proffapt[2,4] == ", uname.slice(2,5)) // and so on..
l("Replacing first occurance of f with x : ", uname.replace("f", "x"))
l("concatinating uname with name : ", uname.concat(name))
let spaces="         adf   asf         "
l("Trimming out spaces from starting and ending: ", spaces.trim())
// includes, endsWith & startsWith
l(`The word "apt" ${uname.includes('apt') ? 'is' : 'is NOT'} included in "proffapt".`)
