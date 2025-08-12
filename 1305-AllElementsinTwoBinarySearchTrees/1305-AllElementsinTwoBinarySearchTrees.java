// Last updated: 8/12/2025, 10:16:07 PM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll = new ArrayList<>();
        getElements(root1,ll);
        getElements(root2,ll);
        Collections.sort(ll);
        return ll;
    }
    public static void getElements(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        ll.add(root.val);
        getElements(root.left,ll);
        getElements(root.right,ll);

    }
}