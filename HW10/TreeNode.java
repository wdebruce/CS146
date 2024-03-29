public class TreeNode{
	 int val;
	 int count;
	 TreeNode left;
	 TreeNode right;
	 TreeNode() {}
	 TreeNode(int val) { this.val = val; }
	 TreeNode(int val, TreeNode left, TreeNode right) {
		 this.val = val;
		 this.left = left;
		 this.right = right;
		 this.count = 1;
	 }
     
	 //fixes root and calls insertHelper
	 public void insert(int i) {
			if(Tree.root == null) {
				Tree.root = new TreeNode(i, null, null);
			}else {
				insertHelper(Tree.root, i);
			}
		}
		
	 //traverses tree & inserts value into tree
	 private void insertHelper(TreeNode node, int i) {
			int val = node.val;
			if(i < val) {
				if(node.left == null) {
					node.left = new TreeNode(i, null, null);
				}else {
					insertHelper(node.left, i);
				}
			}else if(i > val){
				if(node.right == null) {
					node.right = new TreeNode(i, null, null);
				}else {
					insertHelper(node.right, i);
				}
			}else {
				count++;
			}
		}
  }
