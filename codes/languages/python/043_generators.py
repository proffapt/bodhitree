# Generators
'''
    What?
        Generate values on the fly.
        A generator function returns a generator object.
        - Generator Object?
            It is something which doesn't store the exact value but 
            the information to generate the value and the next value of the sequence.
    Why?
        Sometimes you might use a complex computation on a large dataset
        But the catch is you don't need to do the computation right now, rather whenever you need it
        Rather than having to do all the computation and storing them in the memory at once.
        This is exactly what this thing helps us with
            - Easy to use syntax
            - Light on memory, frees the memory as well
            - Light on processor
    How?
        'yield' keyword suspends the execution of the code until the next value is requested
        This behaviour is called LAZY.
'''
def my_generator():
    for i in range(500):
        yield i

gen = my_generator()
print(next(gen))
print(next(gen))
print(next(gen))
print(next(gen))
print(next(gen))
