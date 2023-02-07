class Employee:
    def __init__(this, name):
        this.name=name
    company = "Apple"
    '''
        There is no hard and fast rule that the first argument should be named `self`
        Rather the first argument can be named anything but whatever it is, it will always refer to 
        the instance of the that class which called it.
    '''
    def show(tinde): 
        print(f"The name is {tinde.name} and company is {tinde.company}")

    # Via normal intuition - works
    def changeComp_I(cls, company):
        Employee.company = company

    @classmethod # To make the following method work
    # Via reference? - Doesn't work
    def changeComp_R(cls, company): # Without the decorator cls is reference to instance, with decorator it is reference to class 
        cls.company = company


e = Employee("proffapt")
e.show()
e.changeComp_R("Tesla")
e.show()

e2 = Employee("jaadu")
e2.show()

# Class methods as alternative constructors
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age 
    
    @classmethod
    def from_str(cls, input):
        return cls(input.split("-")[0], int(input.split("-")[1]))

    # Could have been done like this as well ¯\_(ツ)_/¯ 
    def from_str_E(self, input):
        return Person(input.split("-")[0], int(input.split("-")[1]))

p = Person("proff", 6)
print(p.name, p.age)

# What's the need of using these as an alternative constructor?
'''
    What if the initialisation data is in a different format?
    That's where these come handy
'''
input="apt-9"
# a = Person(input.split("-")[0], int(input.split("-")[1]))
'''
    This works but it makes our main code messy and decreases the ease in use 
    of our class, what if we could put all this crap into our class..
'''
a = Person.from_str(input)
print(a.name, a.age)
yaa = Person.from_str_E(a, input)
print(yaa.name, yaa.age)
