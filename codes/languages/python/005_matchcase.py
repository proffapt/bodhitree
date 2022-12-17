# Match case statements 
# Requires python<=3.10

x=int(input("Enter the value of x: "))
y=int(input("Enter either 1 or 0: "))

match x:
    case 69 if y==0:
        print("Ok, the number was 69 idk what's special about it ¯\_(ツ)_/¯ ")
    case 69 if y==1: ## Ok this is kind of cool if-else integration with match statements is new
        print("Hehe, naughty boy (￢‿￢ ) ")
    case _:
        print("The number was", x, "-> Default case")
