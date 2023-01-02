'''
    Key, Value pairs
    >= python3.7 : Ordered (are used in the order you create them). Earlier werr un-ordered.
'''
dict ={
    "name":"proffapt",
    'sex':"male",
    69:False
}
print(dict) # Printing whole dict
## Printing
# All the keys
print(dict.keys())
# All the values
print(dict.values())
# All the [key, value] pairs
print(dict.items())
# A specific value corresponding to a key
print(dict[69])
#### Alternative
print(dict.get(69)) 
'''
    Difference?
    dict[69] will throw error if key not found
    dict.get(69) will output 'None' if key not found
'''
print(dict.get(96)) 
# looping
## via keys
print("----------")
for key in dict.keys():
    print(dict[key])
## via values
print("----------")
for value in dict.values():
    print(value)
## via key, value pair
print("----------")
for key, value in dict.items():
    print(key, value)
print("----------")

# METHODS FOR DICTIONARIES
a = {0:78, 1:88, 2:69, 3:66, 4:69, 5:79}
b = {11:58, 12:98, 15:39}
print("a =", a, ": b =", b)
a.update(b)
print("Merging b into a :", a)
# Re-setting the values
a = {0:78, 1:88, 2:69, 3:66, 4:69, 5:79}
b = {11:58, 12:98, 15:39}
b.clear()
print("Clearing all the entries from b:", b)
c = a.pop(0)
print("a after popping entry with key==0 =", a, "and corresponding value was", c, ": b =", b)
a.popitem()
print("a after popping the last entry = ", a)
del a[2] # deletes a specific entry
print("a after removing entry with key==2 =", a, ": b =", b)
del b # deletes whole dictionary
print("a =", a, "b has been deleted.")
