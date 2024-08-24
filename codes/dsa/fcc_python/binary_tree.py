from collections import deque 

class TreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        

# Manually creating a tree
#      3 
#    /   \
#   2     5
#  / \
# 1   4     
root = TreeNode(3)
root.left = TreeNode(2)
root.right = TreeNode(5)
root.left.left = TreeNode(1)
root.left.right = TreeNode(4)


def inorder_traversal(root, traversal):
    if root:
        inorder_traversal(root.left, traversal)
        traversal.append(root.key)
        inorder_traversal(root.right, traversal)

traversal = []
inorder_traversal(root, traversal)
print("In Order Traversal:", traversal)


def preorder_traversal(root, traversal):
    if root:
        traversal.append(root.key)
        preorder_traversal(root.left, traversal)
        preorder_traversal(root.right, traversal)
        
traversal = []
preorder_traversal(root, traversal)
print("Pre Order Traversal:", traversal)


def postorder_traversal(root, traversal):
    if root:
        postorder_traversal(root.left, traversal)
        postorder_traversal(root.right, traversal)
        traversal.append(root.key)
        
traversal = []
postorder_traversal(root, traversal)
print("Post Order Traversal:", traversal)


def levelorder_traversal(root, traversal):
    q = deque()
    q.appendleft(root)

    while len(q):
        level = []
        level.append(q.popleft())
        
        for node in level:
            if node:
                traversal.append(node.key)
                q.append(node.left)
                q.append(node.right)
    
traversal = []
levelorder_traversal(root, traversal)
print("Level Order Traversal:", traversal)


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
        pass
    
    def __parse_pre_order_list__(self, ordered_list):
        pass
        
    def __parse_post_order_list__(self, ordered_list):
        pass
