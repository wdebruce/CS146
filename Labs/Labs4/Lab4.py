#Lab4
#Invert a Tree

class TreeNode(object):
    tree = []
    inverse_tree = []

    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def main():
    root = insert(root, 1)
    root = insert(root, 2)
    root = insert(root, 8)
    root = insert(root, 3)
    root = insert(root, 4)
    root = insert(root, 5)
    root = insert(root, 6)

    print("Original Tree Array:", TreeNode.tree)
    
    invertTree(root)
    print("Inverted Tree Array: Expected: [1, 8, 2, 6, 5, 4, 3], Actual:", TreeNode.inverse_tree)

def invertTree(self, root):
    if root is None:
        return None
    
    temp = root.left
    root.left = root.right
    root.right = temp
    
    invertTree(root.left)
    invertTree(root.right)
    
    TreeNode.inverse_tree.append(root.val)
    
    return root

def insert(root, val):
    if root is None:
        root = TreeNode(val)
        TreeNode.tree.append(val)
        return root
    
    if val < root.val:
        root.left = insert(root.left, val)
    else:
        root.right = insert(root.right, val)
    
    return root

if __name__ == "__main__":
    main()
