// Last updated: 9/5/2025, 12:10:27 PM
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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum =0;
        answer(root, targetSum, sum, new ArrayList<Integer>());
        return ans;
        
    }
    public void answer( TreeNode root, int targetSum, int sum,List<Integer> ll){
        if(root == null){
            return;
        }
        sum += root.val;
        ll.add(root.val);

        if(root.left == null && root.right == null && sum == targetSum){
            ans.add(new ArrayList<>(ll));
        }
        
        answer(root.left ,targetSum, sum, ll);
        answer(root.right ,targetSum, sum, ll);
        ll.remove(ll.size()-1);
    }
}