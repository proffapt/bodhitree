# Introduction to strings
###### STRINGS ARE IMMUTABLE #######

str="This is a string"
print((type(str)))
yastr='This is also a string'
print((type(yastr)))

name="Proffapt"
print("My name is, "+name)
# OR
print("My name is,", name)

## Multi-line strings
comment="""
Hello there people,
I loved this video!!
Kudos to the makers !!
It was funny when he said:  "shut the fuck up"
"""
print(comment)
### Handles everything - newline, tab, quotes whatever..

## Character world of string
print(name[1]) 
#### In pythong string is "LIKE" an array of characters! NOT EXACT SAME THING!!
print("Using a for loop")
for character in name:
    print(character)

# Slicing
print(name[0:5]) # 0th character to 5-1th character that is 4th based on programming indexing
## OR
print(name[:5]) # It's 0 be default _ that is from starting
print(name[5:]) # till end
print(name[4:7])
## Negative slicing
print(name[0:-3]) # is evaluated as len(proffapt)-3
print(name[-3:]) # is evaluated as len(proffapt)-3
### basically negative numbers are converted to len(str)-number
print(name[-5:-3]) # including 8-5=3 and not including 8-3=5

## Finding length
print("'proffapt' has", len(name), "letters")

# String Methods
print(name.upper()) # a new string is created here, since strings are immutable!
print(name.lower())
""" 
    Will the above method 'convert' the string to upper or lower?
    -> NOOO, it won't 'convert' it will create a new string. The older strings stays the same.
"""
## stripping out white spaces in END as well as BEGINNING of string
text="  HEHE Fuck OFF "
print(text.strip())
## stripping out trailing "END" characters
text2="^^my text^hehe^^^^"
print(text2.rstrip("^"))
