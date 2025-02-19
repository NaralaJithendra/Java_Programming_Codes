package trees;

/**
 *  @NaralaJithendra
 */

class ValidBST {
	public String isValidBST(TreeNode node) {
		return isValid(node,Integer.MIN_VALUE, Integer.MAX_VALUE)?"Yes, Node is a Valid Binary Search Tree(BST)": "No, Node is not a Valid Binary Search Tree(BST)";
	}
	
	private boolean isValid(TreeNode node, int min,int max) {
		return (node == null) ? true: (node.val<=min && node.val>max)? false : node.val<min ? isValid(node.left, node.val, max) : isValid(node.right, min, node.val);
	}
}
