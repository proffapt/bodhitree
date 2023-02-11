class Parent:
    def mehh(self):
        print("Parent ka method")

class Child(Parent):
    def mehh(self):
        print("Child ka method")

c = Child
c.mehh(c)
