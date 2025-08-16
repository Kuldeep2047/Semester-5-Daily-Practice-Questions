// Last updated: 8/17/2025, 12:02:23 AM
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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = createTree(nums,0,nums.length-1);
        return node;
        
    }
    public TreeNode createTree(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode node = new TreeNode();
        node.val = arr[mid];
        node.left = createTree(arr,si,mid-1);
        node.right = createTree(arr,mid+1,ei);
        return node;
    }
}