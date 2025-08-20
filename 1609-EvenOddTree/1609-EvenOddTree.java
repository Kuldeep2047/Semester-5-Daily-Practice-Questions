// Last updated: 8/20/2025, 6:45:48 AM
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
    public boolean isEvenOddTree(TreeNode root) {
        return levelOrder(root);
    }
    public boolean levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0; 
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode nn = q.poll();
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
                ll.add(nn.val);

            }
            if(level % 2== 0){
                if(! isInc(ll)){
                    return false;
                }
            }else{
                if(! isDec(ll)){
                    return false;
                }
            }
            level++;
        }
        return true;


    }
    public boolean isInc(List<Integer> ll){
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)% 2==0) return false;
            if(i>0 && ll.get(i)<=ll.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public boolean isDec(List<Integer> ll){
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)%2 != 0){
                return false;
            }
            if(i>0 && ll.get(i)>=ll.get(i-1)){
                return false;
            }
        }
        return true;
    }
}



