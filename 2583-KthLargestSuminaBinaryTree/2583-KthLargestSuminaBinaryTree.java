// Last updated: 8/24/2025, 3:26:39 PM
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
    PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
    public long kthLargestLevelSum(TreeNode root, int k) {
        find_sum(root);
        if(pq.size()<k){
            return -1;
        }else{
            for(int i=0;i<k-1;i++){
                pq.poll();
            }
            return pq.poll();
        }
    }
    public void find_sum(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            long sum = 0;
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
            pq.add(sum);
        }
    }
}