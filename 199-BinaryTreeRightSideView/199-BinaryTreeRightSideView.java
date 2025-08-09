// Last updated: 8/9/2025, 1:44:40 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        rightView(root,1,ll);
        return ll;
    }
    int maxd =0;
    public void rightView(TreeNode root,int curr_level,List<Integer> ll){
        if(root == null){
            return;
        }
        if(maxd<curr_level){
            ll.add(root.val);
            maxd = curr_level;
        }

        rightView(root.right,curr_level+1,ll);
        rightView(root.left,curr_level+1,ll);
    }
}