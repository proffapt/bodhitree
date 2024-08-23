class TreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self, ordered_list, order_type):
        if order_type == "in":
            return self.__parse_in_order_list__(ordered_list)
        elif order_type == "pre":
            return self.__parse_pre_order_list__(ordered_list)
        elif order_type == "post":
            return self.__parse_post_order_list__(ordered_list)
        else:
            return f"Invalid order_type, {order_type}, provided"
    
    def __parse_in_order_list__(self, ordered_list):
        
