marks=[74, 56, 97, 45, "bahahaha", True] # -> can have multiple data types
print(marks)
print(marks[0])
print(marks[1])
print(marks[2])
print(marks[3])
print(marks[4])
print(marks[5])
## Lists are mutable -> Arraylist from java, slices from golang -> you can add new values into them
'''
    Concept of mutability is like jis memory address par woh data tha woh wahi
    over-write hojayega.. 
'''
## Tuple in python aren't mutable -> Arrays of other languages

### Negative Indexing
print(marks[-4]) # read it as len(marks)-4
#           ^^ Can also read as akhri se 4th item::Counting starts from 1!

### Checking the existence of an entry
if 56 in marks:
    print("56 hai")
else:
    print("56 nahi hai")

if 69 in marks:
    print("69 hai")
else:
    print("69 nahi hai")
## Similar for strings
name="proffapt"
if 'r' in name: # Double apostrophe se bhi kaam hojata
    print("r hai")
else:
    print("r nahi hai")

### Slicing of list
print(marks[1:-3]) # means [1, 3)

### Jump Index
print(marks[::2]) # skip JumpIndex-1 entries after printing one entry.
print(marks[::3]) # skip 2 entries after printing one entry.

### List Comprehension
# Generating lists from expressions and conditions
list = [i*i for i in range(10)]
#        ^ These will  
#        be stored
print(list)
list = [i*i for i in range(10) if i%2==0]
#                                   ^ condition to filter out the list
print(list)

##### List methods
list.append(45) # > appending an entry to the list
print("Appending 45 to above list:", list)
list.reverse() # > reverses the list
print("Reversing above list:", list)
list.sort() # > sorting the list in ASCENDING order
print("Sorting above list in ASCENDING order:", list)
list.sort(reverse=True) # > sorting the list in DESCENDING order
print("Sorting in DESCENDING order:", list)
print("Index of `0`:", list.index(0, 3, 6)) # > returns the index of first occurance of the index
##                      Start index  ^  ^ End index.. and obviously (NON INCLUSIVE)
print("Number of occurances of `45`:", list.count(45)) # > counts the number of times 45 has occured

### l is the pointer to the address in memory where the list is
print(list)
m = list # > will create another pointer
m[0]=45
print("m=", m)
print("Printing list after altering m:", list) # > This will also be changed because you know... memory pe data hi change kardiya
## To actually copy a list..
print(list)
n = list.copy()
n[0]=69
print("n=", n)
print("Printing list after altering n:", list)

list.insert(1, 69) # > Index 1 par 69 thoos de
print("Inserting 69 on the index 1:", list)

### Extension of list
a = ["fuck", "your", "momma"]
print("a =", a)
list.extend(a)
print("Extending the list by a:", list)

### Concatenation of list
b = a + list
print("Concatenated list of a & list:", b)
### Note that this is not similar to extension.. in extension the real list is modified
### But in here a new list is created with combination of multiple lists

## The golang equivalent syntax for looping through list
for index, value in enumerate(marks): # Enumerate is like range in golang for iterable data types.. tho range in python only works for integers.
    print("marks[", index, "] =", value)
## ^^ pretty straight forward ¯\_(ツ)_/¯ 
for v in enumerate(marks):
    print(v)
## As obvious from the above output v is a particular entry as a tuple with (index, value) format
### Changing the starting index value
for index, value in enumerate(marks, start=1): ## By this indexing starts from 1 instead of 0
    print("marks[", index, "] =", value)
