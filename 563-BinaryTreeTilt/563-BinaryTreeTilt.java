// Last updated: 8/9/2025, 1:42:53 PM
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
    public int findTilt(TreeNode root) {
        Binary_Tree_Tilt(root);
        return totalTilt;
    }
    int totalTilt = 0;
    public int Binary_Tree_Tilt(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Binary_Tree_Tilt(root.left);
        int right = Binary_Tree_Tilt(root.right);
        int diff = Math.abs(left - right);
        
        totalTilt += diff;

        return left + right + root.val;
    }
}