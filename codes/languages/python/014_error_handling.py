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
