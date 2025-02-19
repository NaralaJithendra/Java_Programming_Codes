/**
 * 
 */
package trees;

/**
 *  @NaralaJithendra
 */

public class PrintTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		bst.insert(80);
		node=bst.getRootNode();
		order.inorder(node);
		
	}

}
