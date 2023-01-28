import pandas # Import the module along with other modules it depends on with all the functions and variables inside them accesible via `dot notation`
from math import sqrt, pi # Imports specific functions & variables only. NO need to use dot notation while using them
import numpy as np # aliasing the imported module for convenience in `dot noatation`
from math import floor as f # Combining both the above just read approaches
from gurobipy import * # Imports everything from gurobipy & can be accessed without `dot notation`
##                   ^ This method is not recommended
## Importing custom made modules
import _filetoimport as mymod # first print statement will be executed as soon as this file is imported

result = sqrt(9)
print("root(9) =", result, "pi =", pi)
try:
    df = pandas.read_csv("./some_csv_file.csv")
except:
    print("file not found!")
print(np.absolute(-66))
mod = Model(name="random")
print(f(67.77))

print("`dir()` function is used to print all the functions and variables inside a module:", dir(gurobipy))
mymod.welcome(mymod.name)
