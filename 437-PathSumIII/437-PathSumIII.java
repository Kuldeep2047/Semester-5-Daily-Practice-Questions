// Last updated: 1/2/2026, 3:30:57 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int pathSum(TreeNode root, long targetSum) {
18
19        return answer(root, targetSum);
20    }
21
22    public int answer(TreeNode root, long targetSum){
23        if(root == null){
24            return 0;
25        }
26        
27        int fromroot = dfs(root, targetSum);
28        int leftnode = answer(root.left, targetSum);
29        int rightnode = answer(root.right, targetSum);
30
31        return leftnode + rightnode + fromroot;
32
33    }
34
35    public int dfs(TreeNode node, long tar){
36        if(node == null){
37            return 0;
38        }
39
40        int count =0;
41
42        if(node.val == tar){
43            count++;
44        }
45        
46
47        count += dfs(node.left, tar - node.val);
48        count += dfs(node.right, tar - node.val);
49
50        return count;
51    }
52}