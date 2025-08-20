// Last updated: 8/20/2025, 6:16:50 AM
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
    
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        answer(root,map);
        // List<Integer> ll = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int idx =0;
        for(int i : map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
            }
            
        }
        for(int i : map.keySet()){
            if(map.get(i)==max){
                idx++;
            }  
        }
        int[] arr = new int[idx];
        idx =0;
        for(int i:map.keySet()){
            if(map.get(i)==max){
                arr[idx++] = i;
            }
        }
        return arr;
        

    }
    public static void answer(TreeNode root,HashMap<Integer,Integer> map){
        if(root == null){
            return;
        }
        int n = root.val;
        map.put(n, map.getOrDefault(n,0)+1);
        answer(root.left,map);
        answer(root.right,map);
    }
}