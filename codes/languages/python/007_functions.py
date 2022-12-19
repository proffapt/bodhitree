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

# Arguments

## Required arguments
## a & b in the first functions are required arguments, i.e., you have to give them at any cost.

## Default arguments
def average(a=9, b=8):
    print("Average =", (a+b)/2)

average()
average(5, 9)
average(8) # means a = 8 and b is default
average(b=9) # a is default

## Keyword arguments
## Can change order of arguments
average(b=69, a=1)

## Variable Length arguments
def advavg(*n):
        #   ^ is a tuple
    sum=0
    for i in n:
        sum+=i
    print("Average =", sum/len(n))
#### The value of function without a return statement is "None"

advavg(5, 6)
advavg(5, 6, 9)
advavg(5, 6, 9, 20)

### taking input as a dict
def pname(**n):
        #   ^ is a dict
    print("Hello ,", n["firstname"], n["middlename"], n["lastname"])

pname(firstname="Bhim", middlename="rao", lastname="ambedkar")
