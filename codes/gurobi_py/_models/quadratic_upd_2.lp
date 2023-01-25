\ Model Quadratic Programming
\ LP format - for model browsing. Use MPS format to capture full model detail.
Minimize
 [ 2 x ^2 + 4 y ^2 + z ^2 ] / 2 
Subject To
 R0: x + 3 y + 2 z >= 5
 R1: y + z >= 2.5
 qc0: [ - x ^2 + y ^2 + z ^2 ] <= 0
Bounds
Binaries
 z
End
