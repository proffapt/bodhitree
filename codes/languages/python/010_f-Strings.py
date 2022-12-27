# format() Is used to place variables conveniently into strings
uname = "proffapt"
country = "India"

mystr = "My username is {} and I am from {}."
print(mystr.format(uname, country))

mystr = "My username is {} and I am from {}."
print(mystr.format(country, uname))
## OOPS! how to solve?
### Old method
mystr = "My username is {1} and I am from {0}."
print(mystr.format(country, uname))
### OR
mystr = "My username is {U:s} and I am from {CN:s}." ## Syntax: Variable:format_specifier (printf wale hi chal jayenge)
print(mystr.format(CN=country, U=uname))
#### But this is not convenient enough
### New Method : f-Strings
myFstr = f"My username is {uname} and I am from {country}"
print(myFstr)

## alternative conversion of anything to string
integer = f"{2*99}"
print(type(integer))

print(f"We use f-strings like this: My username is {{uname}} and I am from {{country}}") # Backslash ("\") won't work inside f-strings
