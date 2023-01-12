name='proffapt'
def welcome(user):
    print("Welcome master,", user)

print("This will also run when this file is imported")
print(__name__)
## Above statement will give __main__ when this file is directly executed
## And when this is imported it will give the name of this file
if __name__ == "__main__":
    print("This statement will run only if this file is executed")
