// Last updated: 10/5/2025, 12:10:26 PM
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
    public int countNodes(TreeNode root) {
        return Tree_Nodes(root);
    }
    public int Tree_Nodes(TreeNode root){
        if(root == null){
            return 0;
        }

        int right = Tree_Nodes(root.right);
        int left = Tree_Nodes(root.left);

        return 1+ right + left;
    }
}