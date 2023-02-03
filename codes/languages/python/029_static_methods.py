# When something can be invoked via class or object both - It is not associated with either of them!
class Math:
    @staticmethod
    def add(a, b): # Doesn't require the `self` keyword.
        return a+b

a = Math()
print(a.add(4, 5))
# Also, doesn't require an instance of the class in order to be invoked
print(Math.add(5, 5))
# print(add(6, 7)) # Won't work!

# WHY?
'''
    Sometimes you want to ship a method with your class.
    But that method doesn't actually need an object to be invoked.

    OR

    Say you are creating a class which contains all the methods related to Linear programming
    It will be senseless to create object and the invoke the methods, rather you can invoke them directly using the other
    method via class name.
'''
