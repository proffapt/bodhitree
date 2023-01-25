import gurobipy as gp
from gurobipy import *

# Driver Code
## Defining the model
mod = gp.Model(name="Linear Programming Problem")
## Defining the variables
x = mod.addVar(name="x", vtype=GRB.CONTINUOUS, lb=0)
print(x)
y = mod.addVar(name="y", vtype=GRB.CONTINUOUS, lb=0)
## Defining the objective function
mod.setObjective(5*x + 4*y, GRB.MINIMIZE)
## Defining the constraints
c1 = mod.addConstr(x+y>=8 ,name='c1')
c2 = mod.addConstr(2*x+y>=10, name='c2')
c3 = mod.addConstr(x+4*y>=11, name='c3')
## Saving the model to a file
mod.write("./_models/lpp.lp")
## Optimising the model
mod.setParam("OutputFlag", False) # Silencing the gigantic output
mod.optimize()
## Outputting the result
print("Objective Function Value:", mod.objVal)
for v in mod.getVars():
    print(v.varName, v.x)
