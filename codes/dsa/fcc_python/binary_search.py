# The good old classic binary search
def classic_binary_search(nums, desired_num):
    low, high = 0, len(nums) - 1
    
    while low <= high:
        mid = (low + high) // 2
        mid_num = nums[mid]

        if mid_num == desired_num:
            return mid
        elif mid_num < desired_num:
            low = mid + 1
        else:
            high = mid - 1
    
    return -1

# nums = [1, 2, 3, 4, 5, 6, 7]
# print(classic_binary_search(nums, 2))

# Same as the classic binary search but..
# In case of repeated numbers (and that's your key too)
# It should return the first occurance
def mutated_binary_search(nums, desired_num):
    low, high = 0, len(nums) - 1

    while low <= high:
        mid = (low + high) // 2
        mid_num = nums[mid]

        if mid_num == desired_num:
           while nums[mid - 1] == mid_num:
               mid -= 1
               
           return mid
        elif mid_num < desired_num:
           low = mid + 1
        else:
           high = mid - 1
        
    return -1
    
nums = [1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 7]
print(mutated_binary_search(nums, 2))

# Alternative method
def smart_mutated_binary_search(nums):
    lo, hi = 0, len(nums) - 1
    
    while lo <= hi:
        mid = (lo + hi) // 2
        mid_num = nums[mid]

        where = where_to_go(nums, mid)
        # The above function has the criteria to find the "desired_num"
        
        if where == "stop":
            return mid
        elif where == "right":
            lo = mid + 1
        elif where == "left":
            hi = mid - 1

    return -1
