from gurobipy import GRB, Model

mod = Model('Quadratic Programming')

x = mod.addVar(name='x')
y = mod.addVar(name='y', vtype=GRB.INTEGER)
z = mod.addVar(name='z', vtype=GRB.BINARY)

mod.addConstr(x + 3*y + 2*z >= 5)
mod.addConstr(y + z >= 2.5)

mod.setObjective(x**2 + 2*y**2 + 0.5*z**2, GRB.MINIMIZE)

mod.setParam('OutputFlag', False)
mod.write('./_models/quadratic.lp')
mod.optimize()

print('Objective Function', mod.objVal)
for v in mod.getVars():
    print(v.varName, ":", v.x)

print("*************** Updating the model ***************")
print("--------------- Updating variable type of y ---------------")
y.vtype=GRB.CONTINUOUS

mod.setParam('OutputFlag', False)
mod.write('./_models/quadratic_upd_1.lp')
mod.optimize()

print('Objective Function', mod.objVal)
for v in mod.getVars():
    print(v.varName, ":", v.x)

print("--------------- Adding a new constraint ---------------")
mod.addConstr(z**2 + y**2 <= x**2)

mod.setParam('OutputFlag', False)
mod.write('./_models/quadratic_upd_2.lp')
mod.optimize()

print('Objective Function', mod.objVal)
for v in mod.getVars():
    print(v.varName, ":", v.x)
