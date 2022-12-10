a = 1
b = True
c = "proff"
d = None
e = 2.4
f = complex(4, 5)

print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
print(type(f))

# operations work on same data typed vars.. obviously.. but here's a catch i mean like numbers can be added to numbers
# so if float is added to int they both still are numers right.. so that works tho the final output is converted into the datatype
# of higher order.. that's another story..

# collection of datas and can be of different data types - mutable
list = [8, 6.7, [2, 5], "fuck", True]
print(type(list))
print(list)

# same as above but - immutable
touple = (8, 6.7, [2, 5], "fuck", True)
print(type(touple))
print(touple)
