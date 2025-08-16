// Last updated: 8/17/2025, 12:05:50 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCA(root,p,q);
    }

    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p || q == root){
            return root;
        }


        TreeNode left = LCA(root.left,p,q);
        TreeNode right = LCA(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }else{
            return left;
        }
    }
}