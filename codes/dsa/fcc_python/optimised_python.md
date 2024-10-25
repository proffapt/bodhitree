# Python Optimization Guide for Competitive Programming & DSA

## Input/Output Optimization

```python
# Fast Input
import sys
input = sys.stdin.readline  # Much faster than built-in input()

# For multiple integers on one line
a, b = map(int, input().split())

# For array input
arr = list(map(int, input().split()))

# Fast Output
from io import StringIO
import sys
out = StringIO()
sys.stdout = out
print("Hello")  # Goes to buffer
sys.stdout = sys.__stdout__
print(out.getvalue())  # Actually prints
```

## Built-in Functions and Tools

### 1. Collections Module
```python
from collections import (
    Counter,     # for counting elements
    defaultdict, # dictionary with default value
    deque,      # efficient queue with O(1) append/pop from both ends
    OrderedDict  # dictionary that remembers insertion order
)

# Counter example
arr = [1, 2, 2, 3, 3, 3]
count = Counter(arr)  # Counter({3: 3, 2: 2, 1: 1})

# defaultdict example
graph = defaultdict(list)  # for adjacency lists
freq = defaultdict(int)    # for frequency counting

# deque example
queue = deque([1, 2, 3])
queue.append(4)      # add to right
queue.appendleft(0)  # add to left
queue.pop()         # remove from right
queue.popleft()     # remove from left
```

### 2. Heapq for Priority Queues
```python
import heapq

# Min heap operations
heap = []
heapq.heappush(heap, 1)
min_val = heapq.heappop(heap)

# For max heap, negate the values
max_heap = []
heapq.heappush(max_heap, -1)
max_val = -heapq.heappop(max_heap)

# Convert list to heap in-place
arr = [3, 1, 4, 1, 5]
heapq.heapify(arr)  # O(n)
```

## List Operations Optimization

### 1. List Comprehensions
```python
# Faster than traditional loops
squares = [x*x for x in range(1000) if x % 2 == 0]

# 2D lists
grid = [[0] * cols for _ in range(rows)]  # Correct way
# DON'T do: [[0] * cols] * rows  # Creates references!
```

### 2. Efficient List Operations
```python
# Joining strings
strings = ['a', 'b', 'c']
result = ''.join(strings)  # Much faster than += for strings

# Reversing
arr.reverse()  # in-place, faster than arr[::-1]

# Sorting
arr.sort()  # in-place
sorted_arr = sorted(arr)  # creates new list

# Custom sort
points.sort(key=lambda x: (x[0], x[1]))  # sort by multiple criteria
```

## Time Complexity Optimization Tips

### 1. Use Sets for O(1) lookup
```python
numbers = set([1, 2, 3])
if x in numbers:  # O(1) vs O(n) for lists
    pass
```

### 2. Dictionary for Mapping
```python
# Use dict for O(1) lookup instead of searching lists
mapping = {x: i for i, x in enumerate(arr)}
```

### 3. Generator Expressions for Memory Efficiency
```python
# Use generators for large sequences
sum(x*x for x in range(1000000))  # More memory efficient than list comprehension
```

## Advanced Optimizations

### 1. Bisect Module for Binary Search
```python
from bisect import bisect_left, bisect_right

arr = [1, 2, 2, 2, 3]
left = bisect_left(arr, 2)   # 1
right = bisect_right(arr, 2) # 4
count = right - left         # Count of 2s
```

### 2. Math Operations
```python
from math import gcd, lcm  # Python 3.9+
from math import ceil, floor, sqrt

# Modular arithmetic
MOD = 10**9 + 7
result = pow(base, exp, MOD)  # Efficient modular exponentiation
```

### 3. Useful Built-in Functions
```python
# Binary operations
bin(10)[2:]  # binary representation
x & -x       # lowest set bit
x | y        # bitwise OR
x ^ y        # bitwise XOR

# Number manipulation
divmod(a, b)  # returns (a // b, a % b)
abs(x)        # absolute value
round(x)      # rounding
```

## Common Patterns for CP

### 1. Fast Modular Exponentiation
```python
def power(base, exp, mod):
    result = 1
    while exp > 0:
        if exp & 1:
            result = (result * base) % mod
        base = (base * base) % mod
        exp >>= 1
    return result
```

### 2. Custom Input Template
```python
def solve():
    n = int(input())
    arr = list(map(int, input().split()))
    # Your solution here
    return answer

if __name__ == "__main__":
    t = int(input())  # number of test cases
    for _ in range(t):
        print(solve())
```

## Memory Optimization Tips

1. Use `__slots__` for classes with fixed attributes
2. Use `array` module for homogeneous data types
3. Delete unused variables with `del`
4. Use generators instead of lists when possible

## Common Pitfalls to Avoid

1. Don't use recursion for problems with deep call stacks (Python's limit is 1000 by default)
2. Avoid creating new lists/strings in loops
3. Don't use `+` for string concatenation in loops
4. Be careful with global variables in recursive functions

Remember: Profile your code when possible to identify bottlenecks!
