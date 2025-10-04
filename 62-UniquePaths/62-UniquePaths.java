// Last updated: 10/4/2025, 9:33:59 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return paths(0, 0, m-1, n-1 ,dp);
    }

    public static int paths(int cr, int cc, int er ,int ec, int[][] dp){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }

        if(dp[cr][cc] != 0){
            return dp[cr][cc];
        }
        
        int a = paths(cr +1, cc, er, ec, dp);
        int b = paths(cr , cc+1, er, ec, dp);

        return dp[cr][cc] = a+b;
        
    }
}