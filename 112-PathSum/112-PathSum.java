// Last updated: 8/9/2025, 1:45:24 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isSum(root,targetSum);
    }
    public static boolean isSum(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(root.left == null && root.right==null){
            return target-root.val==0;
        }
        boolean left = isSum(root.left,target-root.val);
        boolean right = isSum(root.right,target-root.val);
        return left || right;
        
    }
}