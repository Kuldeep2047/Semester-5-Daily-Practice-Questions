// Last updated: 8/16/2025, 10:24:32 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        zigzagLevel(root,ans);
        return ans;
        
    }
    public void zigzagLevel(TreeNode root,List<List<Integer>> ans){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int zigzag = -1;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode nn = q.poll();
                ll.add(nn.val);
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
                
            }
            if(zigzag == 1){
                Collections.reverse(ll);
            }
            ans.add(ll);
            zigzag *= -1;
        }
    }
}