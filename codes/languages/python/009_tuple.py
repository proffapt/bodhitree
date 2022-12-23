# Tuple is immutable!
## What we mean is the memory address where tuple is located is not modifable
## you can surely assign same variable multiple times with different tuples.. but they are not gonna be in same memory address.
## What's the fucking use then?
###~> Sometimes you want a CONSTANT list like a constant variable.. for that exact reason.
tup = (1, 5, 6, "apple")
# tup[1]=69 # > Un-changeable!
print("The tuple is:", tup, "& obviously its type:", type(tup))

### tuple of size 1
tup1 = (1)
print("The tuple is:", tup1, "& obviously its type:", type(tup1))
## ^^ Gives the type as int.
## Obviously the interpreter is cofused ki whether you have written an integer inside () or tuple.. and obviously it will choose int
tup2 =(1,) # To tell the interpreter explicitly that this is a tuple of size one not an integer
print("The tuple is:", tup2, "& obviously its type:", type(tup2))

### positive and negative indexing
print("tup[-2] =", tup[-2]) # last se 2nd counting starts with 1.. and obviously len(tup)-2

#### And literally every other method is similar as of list.. except for the fact that you can't change the existing tuple.

## Manipulating tuples
### tuple -> list -> modify -> tuple
list = list(tup)
list.append("mango")
list.pop(2)
tup = tuple(list) ## again yahan mene tup ko jab re-assign kiya toh matlab hai uske memory address ko change krdiya jahan woh refer kar raha tha.. woh purani wali tuple abhi bhi memory mein padi hai.
## If it was list and I append, toh ussi memory ko delete karke ya jo kuch bhi karke wahin par at the spot add kiya jata.. woh purani list exist hi nahi karti..tabhi toh MUTATION kehte hain.
print("Modified tuple is:", tup)

## Concatenation
tup3 = tup + tup2
print(tup3)
