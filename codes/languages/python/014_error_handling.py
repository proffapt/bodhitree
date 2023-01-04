# Handling errors in general
try:
    a=int(input("Enter an integer: "))
    for i in range(1,11):
        print(f"{a} x {i} = {a*i}")
except Exception as e:
    print(f"ERROR: {e}")

# Handling specific errors
try:
    i=int(input("Enter the index as an integer: "))
    b = [1, 2, 3]
    print(b[i])
except ValueError:
    print("Invalid index specified!")
except IndexError:
    print("Out of bound!")

# Sometimes you require some lines of code to run irrespective of whatever happens
# Something like cleanup? Closing up data streams and connections etc.
## That's exactly where "finally" keyword helps us.
## It's significance is seen when we try something inside a function and return it.
def fun(i):
    try:
        c = [1, 2, 3]
        i = int(input("Enter an integer:"))
        return c[i]
    except:
        return -1
    finally:
        print("This is always executed!") # will still run even if the function has returned.

print(fun(i))
