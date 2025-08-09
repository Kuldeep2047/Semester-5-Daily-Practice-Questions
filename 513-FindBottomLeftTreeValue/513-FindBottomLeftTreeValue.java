// Last updated: 8/9/2025, 1:43:03 PM
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
    public int findBottomLeftValue(TreeNode root) {
        
        answer(root,1);
        return ans;
    }
    int maxd =0;
    int ans;
    public void answer(TreeNode root,int cl){
        if(root==null){
            return;
        }
        if(maxd<cl){
            ans = root.val;
            maxd = cl;
        }
        answer(root.left,cl+1);
        answer(root.right,cl+1);
    }
}