# You are given list of numbers, obtained by rotating a sorted list an unknown
# number of times. Write a function to determine the minimum number of times the
# original sorted list was rotated to obtain the given list. Your function should have
# the worst-case Lomplexity of O ( log N ) , where N is the length of the list. You can
# assume that all the numbers in the list are unique.
def where_to_go_one(list1, mid):
    mid_num = list1[mid]

    if mid - 1 >= 0 and list1[mid - 1] > mid_num:
        return "stop"
    elif :
        return "left"
    elif :
        return "right"

    
def sol_one(list1):
    lo, hi = 0, len(list1) - 1
    
    while lo <= hi:
        mid = (lo + hi) // 2

        where = where_to_go_one(list1, mid)
        
        if where == "stop":
            return mid
        elif where == "right":
            lo = mid + 1
        elif where == "left":
            hi = mid - 1
