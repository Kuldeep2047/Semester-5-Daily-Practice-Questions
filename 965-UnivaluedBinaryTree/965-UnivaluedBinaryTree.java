// Last updated: 8/26/2025, 11:29:47 PM
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
    public boolean isUnivalTree(TreeNode root) {
        int rootdata = root.val;
        return isSameData(root,rootdata);
        
    }
    public boolean isSameData(TreeNode root,int rootdata){
        if(root == null){
            return true;
        }
        if(root.val != rootdata){
            return false;
        }
        boolean left = isSameData(root.left,rootdata);
        boolean right = isSameData(root.right,rootdata);
        return left && right;
    }
}