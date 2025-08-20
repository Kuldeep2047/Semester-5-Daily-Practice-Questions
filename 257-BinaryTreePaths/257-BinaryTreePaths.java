// Last updated: 8/20/2025, 6:56:30 AM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll = new ArrayList<>();
        answer(root,ll,"");
        return ll;
        
    }
    public void answer(TreeNode root,List<String> ll,String s){
        if(root == null){
            s="";
            return;
        }
        if(root.left == null && root.right==null){
            s+=root.val;
            ll.add(s);
        }else{
            s+=root.val+"->";
        }
        // int n = root.val;
        answer(root.left,ll,s );
        answer(root.right,ll,s );
    }
}