#Lab5
"""We will be solving another problem on trees together! Here's the problem statement:

Given the root of a binary tree, determine if it is a valid binary search tree (BST).
For this lab, we will change the definition of a BST slightly, for simplicity: 

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Remember, this property should apply to all subtrees as well. 
"""
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def main(self):
    self.root = self.insert(self.root, 4)
    self.root = self.insert(self.root, 3)
    self.root = self.insert(self.root, 8)
    print("Tree: 4, 3, 8")
    print("Expected: True, Actual:", self.isValidBST(self.root))

def insert(self, root, val):
    if root is None:
        root = self.TreeNode(val)
        return root
    if val < root.val:
        root.left = self.insert(root.left, val)
    else:
        root.right = self.insert(root.right, val)
    return root

def isValidBST(self, root):
    return isValidBSTHelper(root, float('-inf'), float('inf'))

def isValidBSTHelper(self, root, min, max):
    if root is None:
        return True
    if root.val <= min or root.val >= max:
        return False
    return (isValidBSTHelper(root.left, min, root.val) and
                isValidBSTHelper(root.right, root.val, max))
