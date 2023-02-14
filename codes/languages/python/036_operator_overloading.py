## Continuation of previous topic - Dunder Method
## Operator Overloading
'''
    The concept is same as that in other languages, but here is a twist
    Combining operator overloading concept with dunder method can enable you to
    over-write the implementation of binary operations like '+', '-', '//', '%' etc.
'''
class Vector:
    def __init__(self, i, j, k):
        self.i = i
        self.j = j
        self.k = k

    def __str__(self):
        return f"{self.i}i + {self.j}j + {self.k}k"
    
    def __add__(self, x):
        return Vector(self.i+x.i, self.j+x.j, self.k+x.k)

v1 = Vector(1, 2, 3)
print(v1)
v2 = Vector(5, 4, 3)
print(v2)

print(v1+v2) # __add__ over-wrote '+'
