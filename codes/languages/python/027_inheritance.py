class Employee:
    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def showDetails(self):
        print(f"Employee's name is {self.name} with an id : {self.id}")

# Single Inheritance
'''
    Such an Inheritance where `One Parent has One Child`
    is called SINGLE INHERITANE.
'''
# Inheritance in python works like this with NO `extend` keyword
class Programmer(Employee):
    def showLanguage(self):
        print(f'The default language is Python')

e = Employee("Rohan Das", 420)
e.showDetails()
# e.showLanguage() # will give error
p = Programmer("proffapt", 69)
p.showDetails()
p.showLanguage()

# Multiple Inheritance
'''
    One child, more than one parents
    And order of specifying the parent classes doesn't matter, if
    the parent classes are independent of each other... BUT
    if one of the parent class is itself inherited from the other
    parent class, then the order should be YetAnotherChild(Child, Parent)

    class PrgrammerEmployee(Employee, Programmer):
                              ^ This won't work

    Note that this particular example is a combination of Multilevel & Multiple Inheritance
    But the concept for multiple inheritance stays the same.
'''
class PrgrammerEmployee(Programmer, Employee):
    def rant(self):
        print('Fuck the World!')

pe = PrgrammerEmployee("khalnayak", 99)
pe.rant()
# MRO - Method Resolution Order
print(PrgrammerEmployee.mro())
'''
    Output tells that, 
    First it will look for the method in PrgrammerEmployee class
    Then in Programmer
    Then in Employee

    class PrgrammerEmployee(Programmer, Employee):
        PrgrammerEmployee > Programmer > Employee

    Clear to visualize
'''

# Multilevel inheritance
'''
    When the Derived class is Derived from a class which itself is derived from another class
'''
class LazyProgrammer(Programmer): # Employee > Programmer > LazyProgrammer
    def info(self):
        print("I am a lazy programmer")

l = LazyProgrammer("somsy", 88)
l.info()
