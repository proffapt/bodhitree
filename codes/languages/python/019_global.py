x = 6 # Global variable


def func1():
    print("Using global variable, x, inside a function:", x) # Uses the global variable when there is no local variable defined
    y = 69 # Local Variable
    print ("Local variable y =", y)


def func2():
    x = 9 # This creates a local copy of x, global variable remains intact
    print("Local copy of global variable x =", x)


func1()
func2()
print("Using global variable, x, from the globe :shrug:", x)

# What if you wanted to use the global variable inside the function
def func3():
    global x
    x = 9
    print("Using global variable, x, inside a function via global keyword:", x) # Uses the global variable when there is no local variable defined


func3()

## Generally this is NOT a good practice to modify a global variable inside a local block
