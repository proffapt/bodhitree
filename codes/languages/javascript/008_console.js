console.time("Label for the action: running code")
console.info("This is an info") // Goes to the info section
console.log("This is a log") // Goes to the info section as well
console.error("This is an error") // Goes to the error section
console.warn("This is a warning") // Goes to the warning section
console.clear()
obj ={a:1, b:2, c:3}
console.table(obj)
// Assert be like.. tum mujhe false statement do mein tumhe error dunga
console.assert(55>7) // Normal
console.assert(55<7) // Goes the the eror section
console.timeEnd("Label for the action: running code")
