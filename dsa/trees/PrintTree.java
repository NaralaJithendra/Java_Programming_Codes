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
		ValidBST valid = new ValidBST();
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

		System.out.println("Getting the Root");
		node=bst.getRootNode();

		System.out.println("InOrder Print");
		order.inorder(node);

		System.out.println("\nPostOrder Print");
		order.postorder(node);

		System.out.println("\nLevelOrder Print");
		order.levelOrder(node);
		
		bst.insert(55);
		node=bst.getRootNode();

		System.out.println("\nUpdating Value 55 to 56");
		System.out.println("Before Updating InOrder Print");
		order.inorder(node);
		bst.update(55, 56);
		node=bst.getRootNode();
		System.out.println("\nAfter Updating InOrder Print");
		order.inorder(node);

		System.out.println("\nSearching Element: 40");
		TreeNode node2=bst.search(node, 40);
		System.out.println("After Searching InOrder Print");
		order.inorder(node2);

		System.out.println("\nIndex of 40: " + bst.indexOf(40));
		System.out.println("Level of 40: " + bst.findLevel(40)+"\nHeight of 40: "+
		bst.findHeight(node));
		
		System.out.println("Deleting Value: 56");
		System.out.println("Before Deleting InOrder Print");
		order.inorder(node);
		bst.delete(56);
		node=bst.getRootNode();
		System.out.println("\nAfter Deleting InOrder Print");
		order.inorder(node);
		System.out.print("\nIs A Valid BinarySearchTree? ");
		System.out.println(valid.isValidBST(node));
	}

}
