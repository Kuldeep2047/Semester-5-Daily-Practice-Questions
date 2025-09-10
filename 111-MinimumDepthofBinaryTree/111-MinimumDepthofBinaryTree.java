// Last updated: 9/10/2025, 10:25:30 PM
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
    int mind = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        answer(root,1);
        return mind;

        
    }
    public void answer(TreeNode root, int currd){
        if(root == null){
            return;
        }
        if(root.left == null && root.right==null){
            mind = Math.min(mind, currd);
            return;
        }
        answer(root.left, currd+1);
        answer(root.right, currd +1);
    }
}