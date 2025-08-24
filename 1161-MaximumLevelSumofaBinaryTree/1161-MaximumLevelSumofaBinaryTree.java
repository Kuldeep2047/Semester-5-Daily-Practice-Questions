// Last updated: 8/24/2025, 3:14:16 PM
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
    // HashMap<Integer,Integer> map = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        int ans = answer(root);
        return ans;
        

    }
    public int answer(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =1;
        int max =Integer.MIN_VALUE;
        int ans =0;
        while(!q.isEmpty()){
            int s = q.size();
            int sum = 0;
            for(int i=0;i<s;i++){
                TreeNode nn = q.poll();
                
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
                sum += nn.val;
            }
            if(sum>max){
                max = sum;
                ans = level;
            }
            level++;
            
        }
        return ans;
    }
}