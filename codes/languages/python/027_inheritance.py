class Employee:
    def __init__(self, name, id):
        self.name = name
        self.id = id
    
    def showDetails(self):
        print(f"Employee's name is {self.name} with an id : {self.id}")

# Inheritance in python works like this with NO `extend` keyword
'''
    Such an Inheritance where `One Parent has One Child`
    is called SINGLE INHERITANE.
'''
class Programmer(Employee):
    def showLanguage(self):
        print(f'The default language is Python')

e = Employee("Rohan Das", 420)
e.showDetails()
# e.showLanguage() # will give error
p = Programmer("proffapt", 69)
p.showDetails()
p.showLanguage()
