package examples.trees;

public class TreeNode_2{
  TreeNode_2 left;
  TreeNode_2 right;
  int val;
  int height;

  public TreeNode_2(int val){
    this.val=val;
    this.left=this.right=null;
    this.height=1;
  }
}
