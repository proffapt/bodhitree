'''
    Used when a function is used multiple times with same input/arguments.
    This concept is called MEMOIZATION.
'''
from functools import lru_cache
import time

@lru_cache(maxsize=None)
def fx(n):
    time.sleep(5)
    return 5*n

# 5 seconds sleep
print(fx(5))
# 5 seconds sleep
print(fx(4))
# 5 seconds sleep
print(fx(20))
print(fx(5))
print(fx(4))
print(fx(20))
