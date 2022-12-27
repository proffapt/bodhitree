# docstrings: as the name suggests are the documentation / description of a class or a method or a function
# '''docstring''' this will be considered as docstring only if it is the first thing in the definition of a function or class

def square(n):
    '''Takes (n) and prints the square of it'''
    print(n**2)

square(5)
print(square.__doc__) # This is how you access docs

print("What is PEP-8? - Stands for Python Enhancement Proposal")
print("It is documentation, guidelines and best practices for pythoneers to write better python code")
