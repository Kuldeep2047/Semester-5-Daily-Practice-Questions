// Last updated: 8/27/2025, 10:35:33 PM
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return answer(root,target);
        // return root;
    }
    public TreeNode answer(TreeNode root,int target){
        if(root == null){
            return null;
        }
        root.left = answer(root.left,target);
        root.right = answer(root.right,target);
        if(root.val == target){
            if(root.left  == null && root.right==null){
                return null;
            }
        }
        return root;

    }
}