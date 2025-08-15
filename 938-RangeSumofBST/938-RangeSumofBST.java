// Last updated: 8/15/2025, 4:34:57 PM
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
    int sum =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        sumBst(root,low,high);
        return sum;
    }
    public void sumBst(TreeNode root,int low,int high){
        if(root == null){
            return;
        }
        int n = root.val;
        if(n>= low && n<=high){
            sum += n;
        }
        sumBst(root.left,low,high);
        sumBst(root.right,low,high);
    }
}