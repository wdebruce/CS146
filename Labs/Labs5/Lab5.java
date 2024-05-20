
public class Lab5 {
	private static TreeNode root = null;
/**We will be solving another problem on trees together! Here's the problem statement:

Given the root of a binary tree, determine if it is a valid binary search tree (BST).
For this lab, we will change the definition of a BST slightly, for simplicity: 

The LEFT subtree of a node contains only nodes with keys LESS than the node's key.
The RIGHT subtree of a node contains only nodes with keys GREATER than the node's key.
Remember, this property should apply to all subtrees as well. 
 * 
 */
	public static void main(String[] args) {
		root = insert(root, 4);
		root = insert(root, 3);
		root = insert(root, 8);
		System.out.println("Tree: 4, 3, 8");
		System.out.println("Expected: True, Actual: " + isValidBST(root));
	}
	
	public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            Lab5 outer = new Lab5();
            root = outer.new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
	public static boolean isValidBST(TreeNode root) {
		int min = -99999999;
		int max = 99999999;
        return isValidBSTHelper(root, min, max);
    }
	public static boolean isValidBSTHelper(TreeNode root, int min, int max) {
		if(root == null) {
			return true;
		}
		if ((root.val <= min) || (root.val >= max)) {
            return false;
        }
		return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
	}
	
class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode() {}
		 TreeNode(int val) { this.val = val; }
		 TreeNode(int val, TreeNode left, TreeNode right) {
			 this.val = val;
			 this.left = left;
			 this.right = right;
		 }
	}
}