// Last updated: 8/27/2025, 8:52:07 PM
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
    ArrayList<TreeNode> ll = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        getNodes(root);
        TreeNode root2 =  balanced(ll,0);
        return root2;
    }
    public void getNodes(TreeNode root){
        if(root == null){
            return;
        }
        getNodes(root.left);
        ll.add(root);
        getNodes(root.right);
    }
    public TreeNode balanced(List<TreeNode> ll , int idx){
        if(idx == ll.size()){
            return null;
        }
		
		TreeNode nn = new TreeNode();
		nn = ll.get(idx);
        nn.left = null;
		// nn.left = balanced(ll, si, mid - 1);
		nn.right = balanced(ll,idx +1);
		return nn;
    }
}