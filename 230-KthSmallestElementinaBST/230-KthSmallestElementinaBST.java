// Last updated: 8/15/2025, 4:50:43 PM
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
    boolean isfound = false;
    int max;
    int c= 0;
    public int kthSmallest(TreeNode root, int k) {
        smallest(root,k);
        return max;
    }
    public void smallest(TreeNode root,int k){
        if(root == null){
            return;
        }
        if(isfound){
            return;
        }
        smallest(root.left,k);
        
        c++;
        if(c==k){
            max = root.val;
            isfound = true;
        }
        
        smallest(root.right,k);
    }
}