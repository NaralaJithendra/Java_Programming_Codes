package com.examples.java.dsa;
import java.util.LinkedList;
import java.util.Queue;

public class TraversalOrder {
	/*
	  
			  50
		     /  \
		   30    70
		  /  \   /  \
		20   40 60  80
		
		Inorder Traversal (Left → Root → Right)         → 20 30 40 50 60 70 80
		Preorder Traversal(Root → Left → Right)         → 50 30 20 40 70 60 80
		Postorder Traversal (Left → Right → Root)       → 20 40 30 60 80 70 50
		Breadth-First Traversal (Level Order Traversal) → 50 30 70 20 40 60 80

	 */
	public void inorder(TreeNode node) {
	    if (node == null) return;
	    inorder(node.left);
	    System.out.print(node.val + " ");
	    inorder(node.right);
	}
	
	public void preorder(TreeNode node) {
	      if (node == null) return;
	      System.out.print(node.val + " ");
	      preorder(node.left);
	      preorder(node.right);
	  }
	
	public void postorder(TreeNode node) {
	      if (node == null) return;
	      postorder(node.left);
	      postorder(node.right);
	      System.out.print(node.val + " ");
	  }
	

	public void levelOrder(TreeNode root) {
	    if (root == null) return;
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(root);

	    while (!queue.isEmpty()) {
	        TreeNode node = queue.poll();
	        System.out.print(node.val + " ");

	        if (node.left != null) queue.add(node.left);
	        if (node.right != null) queue.add(node.right);
	    }
	}
}
