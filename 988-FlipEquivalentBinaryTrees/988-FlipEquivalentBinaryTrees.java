// Last updated: 8/9/2025, 1:41:46 PM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return isFlip(root1,root2);
    }
    public boolean isFlip(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        boolean isMirror = isFlip(r1.left,r2.right) && isFlip(r1.right,r2.left);
        boolean isSame = isFlip(r1.left,r2.left) && isFlip(r1.right,r2.right);
        return isMirror || isSame;
    }
}