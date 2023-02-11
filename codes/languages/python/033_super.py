class Parent:
    def parent_method(self):
        print(f"This is a parent method")

class Child(Parent):
    def parent_method(self):
        super().parent_method(self)
        print(f"Modifications / Additions to inherited parent method")
    def child_method(self):
        print(f"This is a child method")

obj = Child
obj.child_method(obj)
obj.parent_method(obj)

# Utilising the already written code - constructor for this example
class Employee:
    def __init__(self, name, id):
        self.id = id
        self.name = name

class Programmer(Employee):
    def __init__(self, name, id, lang):
        super().__init__(name, id)
        self.lang = lang

p = Programmer("proffapt", 69, "python")
print(p.name, p.id, p.lang)
