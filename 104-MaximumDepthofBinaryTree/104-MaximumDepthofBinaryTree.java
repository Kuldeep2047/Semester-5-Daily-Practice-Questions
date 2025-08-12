// Last updated: 8/12/2025, 10:27:50 PM
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
    int maxd = 0;
    public int maxDepth(TreeNode root) {
        depth(root,1);
        return maxd;
    }
    public void depth(TreeNode root,int cl){
        if(root == null){
            return;
        }
        if(cl>maxd){
            maxd = cl;
        }
        depth(root.right,cl+1);
        depth(root.left,cl+1);
    }
}