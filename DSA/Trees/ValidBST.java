package com.examples.java.dsa;

public class ValidBST {
	public boolean isValidBST(TreeNode node) {
		return isValid(node,Long.MIN_VALUE, Long.MAX_VALUE)?"Yes, Node is a Valid Binary Search Tree(BST)": "No, Node is not a Valid Binary Search Tree(BST)";
	}
	
	private boolean isValid(TreeNode node, Long min,Long max) {
		return (node == null) ? true: (node.val<=min && node.val>max)? false : node.val<min ? isValid(node.left, node.val, max) : isValid(node.right, min, node.val);
	}
}
