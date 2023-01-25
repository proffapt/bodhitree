import gurobipy as gp
from gurobipy import *

# Driver Code
## Defining the model
mod = gp.Model(name="Mixed Integer Linear Programming Problem")
## Defining the variables
x = mod.addVar(name="x", vtype=GRB.BINARY, lb=0)
y = mod.addVar(name="y", vtype=GRB.CONTINUOUS, lb=0)
z = mod.addVar(name="z", vtype=GRB.INTEGER, lb=0)
## Defining the objective function
mod.setObjective(2*x + y + 3*z, GRB.MAXIMIZE)
## Defining the constraints
c1 = mod.addConstr(x+2*y+z <= 4 ,name='c1')
c2 = mod.addConstr(2*z+y <= 5, name='c2')
c3 = mod.addConstr(x+y >= 1, name='c3')
## Saving the model to a file
mod.write("./_models/milp.lp")
## Optimising the model
mod.setParam("OutputFlag", False) # Silencing the gigantic output
mod.optimize()
## Outputting the result
print("Objective Function Value:", mod.objVal)
for v in mod.getVars():
    print(v.varName, v.x)
