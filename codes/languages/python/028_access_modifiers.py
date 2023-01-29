# Public
'''
    By default all the variables in a class followed by self are PUBLIC
    Inheritable, accessible outside class
'''
# Private
'''
    using `__` as prefix in the name of the variable indicates that it's private.
    In other langs we can't access private variables from outside the class.
    We don't exactly have strict private vairiables in here as we have in other languages.
    But in here we can but NOT NORMALLY!
'''
# Protected
'''
    Inheritable + Private = Protected
    They can only be accessed within the class and their children classes
    This is for other languages

    For pythong it's exist just in a naming convention not conceptualised into the langauge itself
'''
class Employee:
    def __init__(self):
        self.public = "public"
        self._protected = "protected"
        self.__private = "private"

e = Employee()
print(e.public)
print(e._protected) # UMM?
'''
    This is just a naming convention
'''
# print(e.__private) # > Can't access normally
# Accessing a private member is not recommended
print(e._Employee__private)
# WTF did just happen?
'''
    Name mangling:
        Python literally changes the name from `__private` to `_Employee__private` when it creates a property
        for that class hence you were not able to access it normally
'''
print(e.__dir__())
