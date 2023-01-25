from gurobipy import GRB, Model

# Setting up the data
weights = [3, 5, 4, 2, 5, 4, 5, 1] ## Weight of objects
values = [2, 8, 10, 5, 18, 12, 15, 1] ## Value of objects
capacity = 15
total_objects = len(weights)
# Defining the model
mod = Model(name="Knapsack Problem")
# Defining the variables
x = mod.addVars(total_objects, name="x", vtype=GRB.BINARY, lb=0)
# Defining the objective function
mod.setObjective(sum(values[i]*x[i] for i in range(total_objects)), GRB.MAXIMIZE) # Maximizing the total value possible
# Defining the constraints
mod.addConstr(sum(weights[i]*x[i] for i in range(total_objects)) <= capacity)
# Saving the model to a file
mod.write("./_models/knapsack.lp")
# Optimising the model
mod.setParam("OutputFlag", False) # Silencing the gigantic output
mod.optimize()
# Outputting the result
print("Objective Function Value:", mod.objVal)
for v in mod.getVars():
    print(v.varName, v.x)
