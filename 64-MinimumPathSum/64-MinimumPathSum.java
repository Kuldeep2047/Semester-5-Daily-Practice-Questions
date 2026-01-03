// Last updated: 1/3/2026, 3:07:50 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int[][] dp = new int[grid.length][grid[0].length];
4        for(int[] a : dp){
5            Arrays.fill(a, 999999);
6        }
7        return answer(grid, 0, 0, dp);
8    }
9    public int answer(int[][] arr, int cr, int cc, int[][] dp){
10        if(cr == arr.length-1 && cc == arr[0].length -1){
11            return arr[cr][cc];
12        }
13        if(cr >= arr.length || cc>=arr[0].length){
14            return Integer.MAX_VALUE;
15        }
16
17        if(dp[cr][cc] != 999999){
18            return dp[cr][cc];
19        }
20
21        int right = answer(arr, cr, cc+1, dp);
22        int down = answer(arr, cr+1, cc, dp);
23
24        return dp[cr][cc] = Math.min(right, down) + arr[cr][cc];
25    }
26
27}