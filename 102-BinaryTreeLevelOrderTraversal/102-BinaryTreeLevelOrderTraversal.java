// Last updated: 8/16/2025, 12:48:05 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Level_Order(root,ans);
        return ans;
        
    }
    public void Level_Order(TreeNode root,List<List<Integer>> ans){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ll = new ArrayList<>();
            int s= q.size();
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
            ans.add(new ArrayList<>(ll));
        }
    }

}