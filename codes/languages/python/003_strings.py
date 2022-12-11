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
text2="This^^my text^^hehe^^^^"
print(text2.rstrip("^"))
## replacing all the occurances of ^ with say, !
print(text2.replace("^", "!"))
## Splitting the string from specified character sequence and putting the parts into a list
print(text2.split("^^"))
## Make first letter capital and rest in small char
text3="proffAPT"
print(text3.capitalize())
## Entered parameter becomes the length of the "new centred" string - expansion of length is done 
## via adding suitable number of characters[default = space] in the BEGINNING & END of string.
centred=name.center(15) # by default -> space
print(centred)
centred=name.center(15, ".") # specifying '.' as the padder
print(centred)
print(len(centred))
## counting the number of occurances
print(text2.count("^"))
## is the string ending with particular character sequence?
print("text2 endswtih '^^^^':", text2.endswith("^^^^"))
print("text2 endswith '^^^':", text2.endswith("^^^"))
print("text2 endswith '^^^^^':", text2.endswith("^^^^^"))
print("the substring of name=proffapt [5,8) ends with 't':", name.endswith("t" , 5, 8)) # does the substring [5, 8) ends with t?
## is the string starting with particular character sequence?
print("text2 startswith 'Thi':", text2.startswith("Thi"))
print("text2 startswith '^^':", text2.startswith("^^^"))
print("the substring of name=proffapt [5,8) ends with 'a':", name.startswith("a" , 5, 8)) # does the substring [5, 8) ends with t?
## find gives first occurance of the string (position) otherwise if not found gives -1
print(name.find("ff"))
print(name.find("fff"))
## index gives first occurance of the string (position) otherwise if not found throws an ERROR
print(name.index("ff"))
# print(name.index("fff")) #-> Throws an error.
## alphanumeric: A-Z, a-z, 0-9
an="haha88"
print("'haha88' is alpha-numeric:", an.isalnum())
an="haha88$" 
###################### -> here I re-assigned the variable : the older string is still their in memory!
print("'haha88$' is alpha-numeric:", an.isalnum())
## alpha: A-Z, a-z
a="adfjaljfa"
print("'adfjaljfa' is alpha:", a.isalpha())
print("'haha88$' is alpha:", an.isalpha())
## lower-case and upper-case
print("'Proffapt' is lower:", name.islower())
print("'adfjaljfa' is lower:", a.islower())
a="JKLJJJ"
print("'JKLJJJ' is lower:", a.isupper())
## Printable
print("'JKLJJJ' is printable:", a.isprintable())
a="aldfjaksdfj\n" # -> \n is not printed infact a new line literally is printed hence a is not printable as it contains \n
print("'aldfjaksdfj\\n' is printable:", a.isprintable())
## if contains only whitespaces only then true!
x="       " # Using spaces
print("'       ' -> using spaces only, is a space:", x.isspace())
x="     " # Using tabs
print("'        ' -> using tabs only, is a space:", x.isspace())
## Fist letter of every word should be capital
x="To Kill A Mocking Bird"
print("'To Kill A Mocking Bird' is a title:", x.istitle())
x="To Kill a Mocking Bird"
print("'To Kill a Mocking Bird' is a title:", x.istitle())
## Convert the string to a title
x="To Kill a Mocking bIRD"
print("Converting 'To Kill a Mocking bIRD' to a title:", x.title())
## Swapping / Interchanging the cases
print("Interchanging the cases of 'To Kill a Mocking bIRD':", x.swapcase())
