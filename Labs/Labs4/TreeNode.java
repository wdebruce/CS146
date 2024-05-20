import java.util.ArrayList;

//Lab4
/**
 * Invert a binary tree
 */

public class TreeNode {
    private static ArrayList<Integer> tree = new ArrayList<Integer>();
    private static ArrayList<Integer> inverseTree = new ArrayList<Integer>();
    private static TreeNode root = null;
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
    
    public static void main(String[] args) {
        root = insert(root, 1);
        root = insert(root, 2);
        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 4);
        root = insert(root, 5);
        root = insert(root, 6);
        
        System.out.println("Original Tree Array: " + tree.toString());
        
        invertTree(root);
        System.out.println("Inverted Tree Array: Expected: [1, 8, 2, 6, 5, 4, 3], Actual: " + inverseTree.toString());
    }
    
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null; // Base Case
        }
        
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
    
    
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            tree.add(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
