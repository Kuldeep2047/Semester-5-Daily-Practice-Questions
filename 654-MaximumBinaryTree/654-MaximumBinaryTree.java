// Last updated: 9/10/2025, 11:12:38 PM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return answer(nums,0,nums.length);
        
    }
    public TreeNode answer(int[] arr,int si,int ei){
        if(si == ei){
            return null;
        }
        int max_idx = maxIdx(arr,si,ei);
        TreeNode root = new TreeNode(arr[max_idx]);
        root.left = answer(arr, si, max_idx);
        root.right = answer(arr, max_idx+1, ei);
        return root;
        
    }


    public int maxIdx(int[] arr, int si, int ei){
        int idx = si;
        int i= si;
        while(i<ei){
            if(arr[idx]<=arr[i]){
                idx = i;
            }
            i++;
        }
        return idx;
    }
}