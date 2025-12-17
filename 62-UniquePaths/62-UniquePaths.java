// Last updated: 12/17/2025, 9:24:33 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        return paths(0, 0, m-1, n-1 ,dp);
5    }
6
7    public static int paths(int cr, int cc, int er ,int ec, int[][] dp){
8        if(cr == er && cc == ec){
9            return 1;
10        }
11
12        if(cr > er || cc > ec){
13            return 0;
14        }
15
16        if(dp[cr][cc] != 0){
17            return dp[cr][cc];
18        }
19        
20        int a = paths(cr +1, cc, er, ec, dp);
21        int b = paths(cr , cc+1, er, ec, dp);
22
23        return dp[cr][cc] = a+b;
24        
25    }
26}