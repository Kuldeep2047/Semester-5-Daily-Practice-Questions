// Last updated: 10/4/2025, 9:39:40 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        return paths(0,0 ,m-1,n-1,dp,obstacleGrid);
    }

    public static int paths(int cr, int cc, int er ,int ec, int[][] dp, int[][] obstacle){
        if(cr > er || cc > ec || obstacle[cr][cc] == 1){
            return 0;
        }
        if(cr == er && cc == ec){
            return 1;
        }

        

        if(dp[cr][cc] != 0){
            return dp[cr][cc];
        }
        
        int a = paths(cr +1, cc, er, ec, dp, obstacle);
        int b = paths(cr , cc+1, er, ec, dp, obstacle);

        return dp[cr][cc] = a+b;
        
    }
}