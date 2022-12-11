a = "1"
b = "2"
print(a+b)

c="proff"
d="apt"
print(c+d)

# '+' is concatination operator for strings

## typecasting
print(int(a)+int(b))
# this is explicit typecasting - when the user themselves provokes the methods of typecasting

# implicit typecasting
x=3.4
y=5
print(x+y)

# float + int = float (the interpreter typcasted the lower order'd variable to that of higher order - impplicitly)
# ^^ This is done to prevent data loss ^^
'''
    Order of datatypes: Double > Float > Int > Char
    ^^ NOT CONFIRM VERIFY ONCE ^^
'''

## Taking input from the user ##
a = input("Please enter a number: ")
print("You entered:", a)
print("Type of entered data is:", type(a)) # This shows that input stores in STRING format

## Methods to handle this
# 1
print("Converting it to integer:", type(int(a)))
# 2 
b = int(input("Please enter an integer: "))
print("You entered:", b)
print("Type of entered data is:", type(b)) # This is the preferred method
