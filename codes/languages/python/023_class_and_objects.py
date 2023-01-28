class Person:
    name = 'proffapt'
    age = 69
    sex = 'male'
    def info(self): # Methods in python should take self parameter
        # Similar to 'this' keyword in other languages but this time you have to pass an argument and use it as usual
        # It is the reference to the current intance of the class aka object
        # Basically, self = woh object jiske liye ye method call kiya jaa raha hai
        print(self.name, self.age, self.sex)

proff = Person() # This is how you create an object in python
proff.info()
proff.name = 'tullu'
print("New name for prof :", proff.name)
proff.info()
