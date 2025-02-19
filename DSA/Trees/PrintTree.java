/**
 * 
 */
package com.examples.java.dsa;

/**
 * @author JithendraNarala
 *
 */
public class PrintTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node;
		BinarySearchTree bst = new BinarySearchTree();
		TraversalOrder order = new TraversalOrder();
		System.out.println("Inserting Values");
		/*
		 			  50
				     /  \
				   30    70
				  /  \   /  \
				20   40 60  80
				
		 */
		bst.insert(50);
		bst.insert(30);
		bst.insert(70);
		bst.insert(20);
		bst.insert(60);
		bst.insert(40);
		node = bst.insert(80);
		order.inorder(node);
		
		
	}

}
