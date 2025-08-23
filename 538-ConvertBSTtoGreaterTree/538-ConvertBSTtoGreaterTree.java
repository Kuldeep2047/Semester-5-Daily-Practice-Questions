// Last updated: 8/23/2025, 10:36:33 PM
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
    public TreeNode convertBST(TreeNode root) {
        return answer(root);
    }
    int sum =0;
    public TreeNode answer(TreeNode root){
        if(root == null){
            return null;
        }
        answer(root.right);
        sum += root.val;
        root.val = sum;
        answer(root.left);
        return root;
    }
}