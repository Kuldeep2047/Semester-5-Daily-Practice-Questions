// Last updated: 8/9/2025, 1:43:28 PM
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
    public int sumOfLeftLeaves(TreeNode root) {
        leftSum(root);
        return sum;
    }
    int sum =0;
    public void leftSum(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left != null && root.left.left==null && root.left.right==null){
            sum += root.left.val;
        }
        leftSum(root.left);
        // sum += root.val;
        leftSum(root.right);
    }
}