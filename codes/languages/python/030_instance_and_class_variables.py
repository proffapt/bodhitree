# WHAT?
'''
    Instance variables
        Separate variables for each instance (object).
    Class variables
        Common/Shared variables for every instance (objects) of the class.
'''

class Employee:
    employeeCount=0
    def __init__(self):
        self.object_variable="Default Value" # Instance variable
        # To invoke the class variable : Class_Name.Varaible_Name
        Employee.employeeCount += 1

e1 = Employee()
e2 = Employee()
print(e1.employeeCount, e2.employeeCount, Employee.employeeCount) # 2 2 2
e1.employeeCount = 0 # Will only change the value for this instance!
print(e1.employeeCount, e2.employeeCount, Employee.employeeCount) # 0 2 2
Employee.employeeCount = 0 # Will change the values for all instances!
print(e1.employeeCount, e2.employeeCount, Employee.employeeCount) # 0 2 2
# Rest about instance variable stays the same
