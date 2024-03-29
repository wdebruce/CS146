import java.util.*;
//Program by William De Bruce
//Homework 10 for CS 146, SJSU
//
public class Tree {
	public static TreeNode root;
	
	public Tree() {
		root = null;
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		TreeNode node = new TreeNode();
		node.insert(50);
		node.insert(10);
		node.insert(90);
		node.insert(40);
		node.insert(60);
		node.insert(100);
		node.insert(-1);
		
		System.out.println(tree.levelOrder(root));
	}

    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
    	if(root == null) return null; //checks if root is null
    	
    	Queue<TreeNode> levelQueue = new LinkedList<TreeNode>();
    	levelQueue.offer(root);
    	
    	while(!levelQueue.isEmpty()) {
    		List<Integer> valsOnLevel = new LinkedList<Integer>();//declares a new list
    		int levelSize = levelQueue.size();
    		
    		for(int i = 0; i < levelSize; i++) { //gathers all vals on the given level
    			TreeNode node = levelQueue.poll();
    			valsOnLevel.add(node.val);
    			if(node.left != null) levelQueue.offer(node.left);
        		if(node.right != null) levelQueue.offer(node.right);
    		}
    		
    		levelOrder.add(valsOnLevel); //adds all vals from this level into levelOrder
    	}
    	
    	return levelOrder;
    }
    	
}
