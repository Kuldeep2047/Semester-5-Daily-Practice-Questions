// Last updated: 8/23/2025, 9:29:15 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        sb.append(root.val);
        if(root.left == null && root.right!=null){
            sb.append("()");
        }
        answer(root.left);
        answer(root.right); 
        return sb.toString();
        
    }
    public void answer(TreeNode root){
        if(root == null){
            return;
        }
        sb.append("(");
        sb.append(root.val);
        if(root.left == null && root.right!=null){
            sb.append("()");
        }
         
        answer(root.left);
        answer(root.right);  
        sb.append(")"); 
         
    }
}