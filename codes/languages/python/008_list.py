marks=[74, 56, 97, 45, "bahahaha", True] # -> can have multiple data types
print(marks)
print(marks[0])
print(marks[1])
print(marks[2])
print(marks[3])
print(marks[4])
print(marks[5])
## ^^ pretty straight forward ¯\_(ツ)_/¯ 
## Lists are mutable -> Arraylist from java, slices from golang -> you can add new values into them
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
