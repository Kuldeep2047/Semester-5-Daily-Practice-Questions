
public class Search_in_a_Binary_Search_Tree {
    

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode searchBST(TreeNode root, int val) {
        return answer(root,val);
    }
    public static TreeNode answer(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left = answer(root.left,val);
        if(left != null){
            return left;
        }
        return answer(root.right,val);

    }
}
