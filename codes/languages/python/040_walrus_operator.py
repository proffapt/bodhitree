# Walrus Operator
'''
    Used in assigning a value to a variable inside an expression

    Why?
        For the people who come from other langs and missed it.
'''
print(a:="proffapt")
# A practical use case
numbers = [1, 2, 3, 4, 5]
copy_n = numbers.copy()

## Aam zindagi
while True:
    a=len(copy_n)
    if a == 0:
        break
    print(copy_n)
    copy_n.pop()

## Mentos zindagi
# while (a=len(numbers)): # > Isn't allowed
while (a:=len(numbers)):
    print(numbers)
    numbers.pop()
