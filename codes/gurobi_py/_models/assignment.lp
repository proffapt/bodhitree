\ Model Assignment Problem
\ LP format - for model browsing. Use MPS format to capture full model detail.
Minimize
  10 x[0,0] + 12 x[0,1] + 19 x[0,2] + 11 x[0,3] + 5 x[1,0] + 10 x[1,1]
   + 7 x[1,2] + 8 x[1,3] + 12 x[2,0] + 14 x[2,1] + 13 x[2,2] + 11 x[2,3]
   + 8 x[3,0] + 15 x[3,1] + 11 x[3,2] + 9 x[3,3]
Subject To
 work_load[0]: x[0,0] + x[1,0] + x[2,0] + x[3,0] = 1
 work_load[1]: x[0,1] + x[1,1] + x[2,1] + x[3,1] = 1
 work_load[2]: x[0,2] + x[1,2] + x[2,2] + x[3,2] = 1
 work_load[3]: x[0,3] + x[1,3] + x[2,3] + x[3,3] = 1
 task_completion[0]: x[0,0] + x[0,1] + x[0,2] + x[0,3] = 1
 task_completion[1]: x[1,0] + x[1,1] + x[1,2] + x[1,3] = 1
 task_completion[2]: x[2,0] + x[2,1] + x[2,2] + x[2,3] = 1
 task_completion[3]: x[3,0] + x[3,1] + x[3,2] + x[3,3] = 1
Bounds
Binaries
 x[0,0] x[0,1] x[0,2] x[0,3] x[1,0] x[1,1] x[1,2] x[1,3] x[2,0] x[2,1]
 x[2,2] x[2,3] x[3,0] x[3,1] x[3,2] x[3,3]
End
