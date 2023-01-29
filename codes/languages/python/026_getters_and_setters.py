class MyClass:
    def __init__(self, value):
        self.value = value

    # Getter - Will be treated as a property like `value` for the created object
    # But won't be overwritable as `value` is
    @property
    def modval(self):
        return 69+self.value

    @modval.setter
    def modval(self, value): # ALLOWED!
        self.value = value

obj = MyClass(10)
print(obj.value)
print(obj.modval)
# obj.modval = 69 # Will throw error - w/o a SETTER
obj.modval = 69
print(obj.modval)
