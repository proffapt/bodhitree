let arr = [1, 3, null, "sex"]
console.log("The array named 'arr' is:", arr)
console.log("Element at 4th index:", arr[4]) // No out of bound error! Instead gives undefined
arr[0] = 69 // Mutable
console.log("The array named 'arr' is:", arr)
console.log("Type of arr:", typeof arr)
