package trees;

/**
 *  @NaralaJithendra
 */

class BinarySearchTree {
	private TreeNode root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int val) {
		root=insertValue(root,val);
	}
	
	private TreeNode insertValue(TreeNode root, int val) {
		if(root == null) {
			System.out.println("Inserting");
			return new TreeNode(val);

		}
		else{
			System.out.println(root.val);
		}
		if(val < root.val) {
			root.left = insertValue(root.left, val);
		}
		else {
			root.right = insertValue(root.right, val);
		}
		
		return root;
	}
	
	public void update(int oldVal, int newVal) {
		root=updateValue( oldVal, newVal);
	}
	
	private TreeNode updateValue(int oldVal, int newVal) {
		root = search(root, oldVal);
		
		if(root!=null) {
			root.val = newVal;
		}
		
		return root;
	}
	
	public TreeNode search(TreeNode root, int val) {
		return searchValue(root, val);
	}
	
	private TreeNode searchValue(TreeNode root, int val) {
		if(root == null || root.val == val) {
			return root;
		}
		
		return val < root.val ? searchValue(root.left, val):searchValue(root.right, val);
	}
	
	private TreeNode updateValue2(int oldVal,int newVal) {
		root = delete(oldVal);
		insert(newVal);
		return root;
	}
	
	public TreeNode delete(int val) {
	    
		return deleteValue(root, val);
	}

	private TreeNode deleteValue(TreeNode node, int val) {
	    if (node == null) return null;

	    if (val < node.val) {
	        node.left = deleteValue(node.left, val);
	    } else if (val > node.val) {
	        node.right = deleteValue(node.right, val);
	    } else {
	        // Node with one or no child
	        if (node.left == null) return node.right;
	        if (node.right == null) return node.left;

	        // Node with two children: Get inorder successor Lets consider below example
	        /*
	         
	                  50
				     /  \
				   30    70
				  /  \   /  \
				20   40 60  80
				
				lets say if  want to delete 50 which has two childs 
				so we have to choose a sucessor which is the smallest 
				in the right child which is 60 so 60 will be replaced by 50. After Replacing the Tree looks like
				
	                  60
				     /  \
				   30    70
				  /  \   /  \
				20   40 60  80
				
				Since we dont need the duplicate 60 we will delete that value.
				
				node value is 60
				
				node.right is 
				 70
				/  \
			   60  80
			   
			   checks first if --> node is not null
			   checks second if 60<70 so --> deletion for left lets say this x
			   checks first if 60 is not null
			   checks second if 60 is not less than 60
			   checks else if 60 is not greater than 60
			   checks else block
			   in that node.left is null so returns node.right which is null as well that made x as null
			    70
			     \
			     80
			     
			     Final Tree After Deletion
			           60
				      /  \
				    30    70
				   /  \      \
				 20   40     80

				
	         */
	        node.val = minValue(node.right); 
	        node.right = deleteValue(node.right, node.val); // Delete successor
	    }
	    return node;
	}

	// Helper function to find the minimum value in the right subtree
	private int minValue(TreeNode node) {
	    while (node.left != null) {
	        node = node.left;
	    }
	    return node.val;
	}
	
	public int indexOf(int val) {
		int index=0;
		return indexOfValue(root,val,index);
	}
	
	private int indexOfValue(TreeNode root, int val, int index) {
		if(root == null) return -1;
		return root.val == val ? index: val<root.val? indexOfValue(root.left, val,2*index+1):indexOfValue(root.right, val, 2*index+2);
	}
	
	/*
	 Example with index
	         50 (0)
	       /     \
	    30 (1)   70 (2)
	   /    \    /    \
	 20(3) 40(4)60(5) 80(6)

	 */
	
	public int findLevel(int val) {
		int level=0;
		return findLevelValue(root, val, level);
	}
	
	private int findLevelValue(TreeNode node, int val, int level) {
	    if (node == null) return -1; // Not found
	    if (node.val == val) return level; // Node found, return its level

	    int left = findLevelValue(node.left, val, level + 1);
	    if (left != -1) return left; // If found in left subtree, return it

	    return findLevelValue(node.right, val, level + 1); // Search in right subtree
	}
	
	/*
	         50 (Level 0)
	       /    
	     30 (Level 1)  
	    /    \   
	  20    40  (Level 2)
	  /
	10 (Level 3)
	
	findHeight(50) → Math.max(findHeight(30), findHeight(null)) + 1; 
	findHeight(30) → Math.max(findHeight(20), findHeight(40)) + 1;
	findHeight(20) → Math.max(findHeight(10), findHeight(null)) + 1;
	findHeight(10) → Math.max(findHeight(null), findHeight(null)) + 1;
	findHeight(10) = Math.max(-1, -1) + 1 = 0;
	findHeight(20) = Math.max(0, -1) + 1 = 1;
	findHeight(40) → Math.max(findHeight(null), findHeight(null)) + 1;
	findHeight(40) = Math.max(-1, -1) + 1 = 0;
	findHeight(50) = Math.max(2, -1) + 1 = 3;


	 */
	
	public int findHeight(TreeNode node) {
	    if (node == null) return -1; // Base case: height of empty tree is -1
	    return Math.max(findHeight(node.left), findHeight(node.right)) + 1;
	}

	public TreeNode getRootNode() {
		return this.root;
	}

	public void postorder(TreeNode node) {
		if (node == null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.val + " ");
	}

	public void inorder(TreeNode node) {
	    if (node == null) return;
	    inorder(node.left);
	    System.out.print(node.val + " ");
	    inorder(node.right);
	}

}
