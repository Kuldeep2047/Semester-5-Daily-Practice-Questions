// Last updated: 8/27/2025, 8:34:59 PM
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
    public TreeNode balanceBST(TreeNode root) {
        getNodes(root);
        TreeNode root2 =  balanced(ll,0,ll.size()-1);
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
    public TreeNode balanced(List<TreeNode> ll , int si,int ei){
        if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		TreeNode nn = new TreeNode();
		nn = ll.get(mid);
		nn.left = balanced(ll, si, mid - 1);
		nn.right = balanced(ll, mid + 1, ei);
		return nn;
    }
}