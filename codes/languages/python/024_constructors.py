class Person:
    # If the constructor has only one argument 'self', then it is called "Default Constructor"
    def __init__(self, name, age, sex): # Constructor in python
        # self is automatically passed as an argument while creating the object
        print("Person object created!")
        self.name = name
        self.age = age
        self.sex = sex
        # return type is None
    def info(self):
        print(self.name, self.age, self.sex)

proff = Person('proff', 6, 'male') 
proff.info()
apt = Person('apt', 9, 'unknown')
apt.info()
