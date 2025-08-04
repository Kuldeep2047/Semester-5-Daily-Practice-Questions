import javax.swing.tree.TreeNode;

public class Insert_into_a_Binary_Search_Tree {
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return answer(root,val);
    }
    public static TreeNode answer(TreeNode root,int val){

        if(root == null){
            return new TreeNode(val);
        }

        if(root.val<val){
            root.right = answer(root.right,val);
        }else{
            root.left = answer(root.left,val);
        }
        return root;
    }
}
 