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
