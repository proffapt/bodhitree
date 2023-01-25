from gurobipy import GRB, Model
import pandas as pd

mod = Model('Assignment Problem')

# Getting data from Excel Sheet
dataframe = pd.read_excel('./_data/assignment_problem.xlsx')
print('Your Data:\n\n', dataframe)
print('\nShape:', dataframe.shape)
print('Value at (1,2):', dataframe.iloc[1,2])

x = mod.addVars(dataframe.shape[0], dataframe.shape[1], vtype=GRB.BINARY, name='x')

mod.addConstrs((sum(x[i,j] for i in range(dataframe.shape[0])) == 1 for j in range(dataframe.shape[1])), name='work_load')
mod.addConstrs((sum(x[i,j] for j in range(dataframe.shape[1])) == 1 for i in range(dataframe.shape[0])), name='task_completion')

mod.setObjective((sum(x[i,j]*dataframe.iloc[i,j] for i in range(dataframe.shape[0]) for j in range(dataframe.shape[1]))), GRB.MINIMIZE)

mod.write("./_models/assignment.lp")
mod.setParam("OutputFlag", False) # Silencing the gigantic output
mod.optimize()

print("Objective Function Value:", mod.objVal)
for v in mod.getVars():
    if v.x > 0:
        print(v.varName, ":", v.x)
