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
def log(func): # No need to provide *args. They are passed by default
    def decorated(*args): # This is the function which is gonna be executed ultimately
        # So, it must have those arguments
        print(f'Logging the execution of {func}')
        print(f'Arguments given : {args}')
        value = func(*args)
        print(f'Return value : {value}')
    return decorated

@log
def sum(a, b):
    return a+b

sum(6, 9)
