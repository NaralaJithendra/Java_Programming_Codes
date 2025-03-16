package examples.trees;

public class AVLTrees{
  private TreeNode_2 node;

  public AVLTrees(){

  }

  private int height(TreeNode_2 node){
    return (node==null)?0:node.height;
  }

  private int getBalanceFactor(TreeNode_2 node){
    return (node==null)?0:height(node.left)-height(node.right);
  }

  public void insert(int val){
    node=insertValue(node,val);
  }

  private TreeNode_2 insertValue(TreeNode_2 node, int val){
    if(node == null){
      return new TreeNode_2(val);
    }
    if(val < node.val){
      node.left = insertValue(node.left, val);
    }
    else if(val > node.val){
      node.right = insertValue(node.right,val);
    }
    else{
      return node;
    }

    node.height = 1+Math.max(height(node.left),height(node.right));
    int balance = getBalanceFactor(node);

    //Left Left Case
    if(balance> 1  && val <node.left.val){
      return rightRotate(node);
    }

    //Right Right Case
    if(balance < -1 && val > node.right.val){
      return leftRotate(node);
    }

    //Left Right Case
    if(balance >  1 && val > node.left.val){
      node.left = leftRotate(node.left);
      return rightRotate(node.left);
    }

    //Right Left Case
    if(balance < -1 && val < node.right.val){
      node.right = rightRotate(node.right);
      return leftRotate(node.right);
    }

    return node;
  }

  private TreeNode_2 leftRotate(TreeNode_2 node){
    TreeNode_2 x = node.right;
    TreeNode_2 y = x.left;
    
    x.left = node;
    node.right = y;

    node.height = 1+Math.max(height(node.height),height(node.right));
    x.height = 1+Math.max(height(x.height),height(x.right));
    return x;
  }

  private TreeNode_2 rightRotate(TreeNode_2 node){
    TreeNode_2 x = node.left;
    TreeNode_2 y = x.right;
    
    x.right = node;
    node.left = y;

    node.height = 1+Math.max(height(node.height),height(node.right));
    x.height = 1+Math.max(height(x.height),height(x.right));
    return x;
  }

  public void printValue(){
    inOrder(node);
    Systm.out.println();
  }

  private void inOrder(TreeNode_2 node){
    if(node == null) return;
    inOrder(node.left);
    System.out.print(node.val+" ");
    inOrder(node.right);
  }
}

