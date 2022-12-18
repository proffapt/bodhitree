def compare(a, b):
    if (a>b):
        print(a, "is greater than", b)
    elif (a==b):
        print(a, "equals", b)
    else:
        print(a, "is less than", b)

def takeInput():
    a=int(input("Enter the value :"))
    return a

# passing will not throw error
# it's like declaration of function not initialisation
def badmeinDefineKarunga():
    pass

x=takeInput()
y=takeInput()
compare(x, y)
