// Last updated: 8/23/2025, 9:38:01 PM
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        answer(root,ll);
        return ll;
    }
    public void answer(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // int ans =0;
        while(!q.isEmpty()){
            int s = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<s;i++){
                TreeNode nn = q.poll();
                max = Math.max(nn.val,max);
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
            }
            ll.add(max);
        }
    }
}