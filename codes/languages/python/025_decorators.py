# What?
'''
    A decorator is a function that takes another function as argument
    and returns a modified function
'''
def greet(func):
    def modified_func():
        print("Welcome to this function")
        func()
        print("Thanks for using this function")
    return modified_func
# We created a decorator just above

# Similar to gree(hello)() 
'''
Greet ko hello diya.. usse modified hello return hua.. fir usse hi execute kardiya
'''
# In order to use it:
@greet
def hello():
    print('Hello, World!')

hello()

# Why?
'''
    One of the many practical use cases can be logging a function call
'''
def log(*args, **kwargs):
    def decorated():
        print(f'Arguments given : {args}')
    return decorated

@log
def sum(a, b):
    return a+b
