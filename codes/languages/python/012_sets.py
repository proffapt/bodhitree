# Sets contain ONLY UNIQUE dataset
'''
    Just as to revise:
        list = [1, 2, 3]
        tuple = (1, 2, 3)
        set = {1, 2, 3} -> Unordered - no gurantee of order of elements
            Hence, you can't use indexes to access the values

    And for future:
        dictionary = {"id":001, "name":"proff"}
'''
s = {1, 2, 3, 4, 3, 3, 2}
print(s) # Although there are multiple entries of some data but those multiple entries will be removed while using set
# Empty set
es = {}
print(type(s))
# Then how to create an empty dictionary?
ed = dict()
print(type(ed))
# Accessing the data in sets
for i in s:
    print(i)

# Methods for sets
a = {1, 2, 5, 6}
b = {3, 6, 7}
print("a =", a, ": b =", b)
## Set Operations
print("a union b :", a.union(b))
print("a intersection b :", a.intersection(b))
print("a difference b :", a.difference(b)) # A - B (Those elements of A which are not in B)
print("a symmetric difference b :", a.symmetric_difference(b)) # Uncommon in A and B (AUB - AintB)
'''
    During these operations a & b sets remained untouched
    You can store the result of these operations into some new variable as well
'''
print("a =", a, ": b =", b)
## Updating sets
### Set Operations
a.update(b) # Stores the value of union into a
print("Sets after union update")
print("a =", a, ": b =", b)
# Re-setting the values
a = {1, 2, 5, 6}
b = {3, 6, 7}
a.intersection_update(b) # Stores the value of intersection into a
print("Sets after intersection update")
print("a =", a, ": b =", b)
# Re-setting the values
a = {1, 2, 5, 6}
b = {3, 6, 7}
a.symmetric_difference_update(b) # Stores the value of symmetric_difference into a
print("Sets after symmetric_difference_update update")
print("a =", a, ": b =", b)
# Re-setting the values
a = {1, 2, 5, 6}
b = {3, 6, 7}
a.difference_update(b) # Stores the value of ifference into a
print("Sets after difference_update update")
print("a =", a, ": b =", b)
### Set types checking
print("Are a & b disjoint?", a.isdisjoint(b))
# Re-setting the values
a = {1, 2, 5, 6}
b = {3, 6, 7}
print("a =", a, ": b =", b)
print("Are a & b disjoint?", a.isdisjoint(b))
print("Is b subset of a?", b.issubset(a))
print("Is a subset of b?", a.issubset(b))
### Non-Set Operations
a.add(7)
b.remove(6)
b.discard(6) # Will not throw an error
print("Sets after addition and removal")
print("a =", a, ": b =", b)
'''
    remove() & discard()
    If the entry is not found which was supposed to be deleted
        remove - throws an error
        remove - DOES NOT throw an error
'''
# Popping out a random entry and catching it as well
randnum = a.pop()
print(randnum)
# Checking if an entry exist in set or not
if 1 in a:
    print("set has 1")
else:
    print("set doesn't have 1")
# Deleting a whole set
del b
# Clearing a whole set
a.clear()
# print(b) # Will give error
print("a after clear() =", a) # Empty set
