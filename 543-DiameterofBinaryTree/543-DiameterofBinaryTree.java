// Last updated: 1/2/2026, 3:49:53 PM
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
16
17class Solution {
18    public int diameterOfBinaryTree(TreeNode root) {
19        return diameter(root).dt;
20    }
21    public DiaPair diameter(TreeNode root) {
22        if(root==null){
23            return new DiaPair();
24        }
25        DiaPair ldp = diameter(root.left); //dt ht
26        DiaPair rdp = diameter(root.right); //dt ht
27        int sd = ldp.ht + rdp.ht +2;
28        DiaPair sdp = new DiaPair();
29        sdp.dt = Math.max(sd,Math.max(rdp.dt,ldp.dt));
30        sdp.ht = Math.max(ldp.ht,rdp.ht)+1;
31        return sdp;
32
33    }
34    class DiaPair{
35        int dt =0;
36        int ht = -1;
37    }
38    
39}
40
41// class Solution {
42//     public int diameterOfBinaryTree(TreeNode root) {
43//         if(root==null){
44//             return 0;
45//         }
46//         int ld = diameterOfBinaryTree(root.left);
47//         int rd = diameterOfBinaryTree(root.right);
48//         int sd = ht(root.left)+ht(root.right)+2;
49//         return Math.max(sd,Math.max(rd,ld));
50//     }
51//     public int ht(TreeNode root){
52//         if(root==null){
53//             return -1;
54//         }
55//         int lh = ht(root.left);
56//         int rh = ht(root.right);
57//         return Math.max(lh,rh)+1;
58//     }
59// }