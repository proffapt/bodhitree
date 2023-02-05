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
