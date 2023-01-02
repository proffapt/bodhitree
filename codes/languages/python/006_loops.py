#### for loops
# Iterable objects are: strings, lists, tuples, dictionaries & sets

name="proffapt"
for i in name:
    print(i, end=", ")
print("\b\b\b\n")

colors=["Red", "Green", "Blue"]
for color in colors:
    for letter in color:
        print(letter, end=", ")
    print("\n")

for i in range(4): ## means [0, 4)
    print(i)
print("----------")

for i in range(4, 7): ## means [4, 7)
    print(i)
print("----------")

for i in range(5, 21, 5): ## means [5, 21) by skipping every 5th entry in the range
    print(i)
## output 5, 10, 15, 20 :=> add the third argument to the first argument and keep doing it until the second argument is still in range.

#### while loops
print("Entering into the domain of while loops")

i=int(input("Enter a number: "))
while(i<=69):
    print(i)
    i=int(input("Enter a number: "))
else:
    print("This tuccch user exceeded the holy limit")

#### break and continue
# break: exit the loop right away!
# continue: skip the portion ahead int the loop body and proceed to next iteration

for i in range(1, 13):
    if(i==11):
        break
    elif(i==5):
        print("5 guna 5 25 howe se, chal nikal ab")
        continue
    print("5 X", i, "=", 5*(i))
else:
    print("This part will never be reached because we are breaking in midway of the loop.. and this else is a part of the loop itself! Hence, break will skip this as well")

#### emulating do-while loop in python
while True:
    i=int(input("Enter a number: ")) 
    print(i) # Till this point no condition checking will execute for first time always.. then condition is checked
    if(i>=69):
        break
else:
    print("This tuccch user exceeded the holy limit")
## The above example show the significance of else part, it is a part of while loop
## else will only be executed once when the condition just became false.
## if you break out of the loop, else will also be skipped!
'''
    In short else is executed when the loop has successfully completed all the iterations.
'''
