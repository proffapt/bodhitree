# dir
'''
    Gives every attribute available for the object
    including __*__ wale bhi
'''
x = [1,2,3]
print(dir(x))

# __dict__
'''
    Returns the dictionary of object properties related with 'self' keyword
    Basically, dictionary  of properties of the current instance
'''
class Random:
    def __init__(self, x, y):
        self.x = x
        self.y = y

r = Random(6, 9)
print(r.__dict__)

# help
'''
    Just like a short manpage for the object
    Provides every information (which is not explicitly provided) out there for the object

    Like it will tell that random class takes two arguments x & y, but won't tell the values we gave to it.
'''
print(help(Random))
print(help(x))
