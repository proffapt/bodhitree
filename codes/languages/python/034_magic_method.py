# Magic / Dunder Methods
'''
    The start & end with `__`.
'''

## __init__
'''
    Gets called automatically
    Already quite familiar with it.
'''
## __len__
'''
    Defines the logic for len() for the instances of that class.
'''
## __str__
'''
    Converts the object to a string representation
    basically, converts the mumbo jumbo details with 
    the memory address when you print an object
    to a string which can make more sense to the users about the object.

'''
## __repr__
'''
    String representation of an object
    which can be used to recreate the object
'''
## __call__
'''
    Makes the object callable
'''
class Employee:
    name = "proffapt"
    def __len__(self):
        i = 0
        for char in self.name:
            i+=1;
        return i
    def __str__(self):
        return f"This is an object of class employee"
    def __repr__(self):
        return f"Employee('__employee_name__')"
    def __call__(self):
        print('Hello, world!')


e = Employee()
print(e.name)
print(len(e))
print(e) # Fallbacks to __repr__ if __str__ is not found 
print(str(e))
print(repr(e))
e()
