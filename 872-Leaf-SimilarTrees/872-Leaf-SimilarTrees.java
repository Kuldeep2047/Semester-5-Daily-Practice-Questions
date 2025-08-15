// Last updated: 8/15/2025, 5:34:16 PM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ll1 = new ArrayList<>();
        List<Integer> ll2 = new ArrayList<>();
        leaf(root1,ll1);
        leaf(root2,ll2);
        if(ll1.size() != ll2.size()){
            return false;
        }

        for(int i=0; i<ll1.size() ;i++){
            if( !ll1.get(i).equals(ll2.get(i))){
                return false;
            }
        }
        return true;
    }

    public void leaf(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ll.add(root.val);

        }
        leaf(root.left,ll);
        leaf(root.right,ll);
    }
}