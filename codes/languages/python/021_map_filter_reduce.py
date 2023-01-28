# Similar as that of what you learnt in JS!
from functools import reduce

'''
    Following all are HIGHER-ORDER functions
    
    Why?
        As they take a function as an argument, hence they are higher order functions
'''
l = [1,2,3,4,5,6,7,8,9,10]
## MAP
'''
    Creates a new iterable after modifying every element of another iterable
'''
map_l = list(map(lambda x: x*x*x, l))
print(f'Cubing all elements of {l = } => {map_l = }')

## FILTER
'''
    Prints those entries for which the function returns true
'''
filter_l = list(filter(lambda x: x%2==0, l))
print(f'Even entries in {l = } are {filter_l = }')

## REDUCE
reduce_l = reduce(lambda x,y: x+y, l)
print(f'Sum of all the elements of {l = } is {reduce_l}')
