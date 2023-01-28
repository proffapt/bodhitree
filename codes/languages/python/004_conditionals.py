import time

age=int(input("Enter your age: "))

if(age>=18):
    print("You can drive")
    print("Inside if statement.")
elif(age<=8):
    if(age<=0):
        print("Beta pehle paida toh hoja")
    else:
        print("Beta jaake dudu piyo")
else:
    print("You can't drive")
    print("Inside else statement")
print("\nIf-else block ended.\n")
## The code goes on checking whether each block-condition evaluates to true or not
## This is done in chonological order from top to bottom. If something evaluates to true
## then that code block is executed; and rest are discarded.

### Exercise
currenttime=time.strftime('%H:%M:%S')
## strftime is the method to format the time into specified format
print("Current time is:", currenttime)
print("Type of time output:", type(time.strftime('%H'))) ## > that's a string
currenthour=int(time.strftime('%H'))
if(currenthour<12):
    print("Good morning")
elif(12<currenthour<16):
    print("Good afternoon")
elif(16<currenthour<21):
    print("Good evening")
else:
    print("Good night")

## Short hand if
a = 69 if 1>0 else 96
print(a)
### Use this only when the statements to be executed are short and the condition being tested is simple..
### Do whatever you want just maintain readability of the code from perspective of third person.

b=69
print("A") if a<b else print("=") if a==b else print("B")
## Read the above statement
# print a if a<b
# else
# print = if a==b
# else
# print B
# see else as the separator of logic

### 'is' V/S '=='
'''
    'is' compares the exact location of object in memory.
    '==' compares ONLY values

    * Both of them do type checking as well (different from JS)
'''
print(6 == '6') # False
print(6 is '6') # False
a = [1, 2]
b = [1, 2]
print(a is b) # False
# Do alag alag objects hain memory mein, han woh baat alag hai ki values same hain
print(a == b) # True
# Value toh same hain na
''''''
a = 3
b = 3
print(a == b) # True
# Wahi purana logic is still applicable: Value toh same hain na
print(a is b) # TRUE: WTAF?
'''
    WTAF did just happen?
    Python is pretty smart ok, if it sees
        - Immutable objects
        - Having same values
        It doesn't create them twice rather 
        it references the ones other than the first one 
        to the same memory location.
    Why to waste memory no?
'''
print((1,2) is (1,2)) # True
print(None is None) # True
