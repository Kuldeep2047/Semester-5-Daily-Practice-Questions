// Last updated: 9/6/2025, 10:56:25 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans =Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] a:dp){
            Arrays.fill(a, -100000);
        }
        for(int i=0;i<matrix[0].length;i++){
            ans = Math.min(ans , answer(matrix, 0, i,dp));
        }
        return ans;
    }

    public int answer(int[][] arr, int r,int c,int[][] dp){
        if(c<0 || c>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(r == arr.length-1){
            return arr[r][c];
        }
        if(dp[r][c] != -100000){
            return dp[r][c];
        }


        int dl = answer(arr , r+1 , c-1, dp);
        int dr = answer(arr , r+1 , c+1, dp);
        int down = answer(arr, r+1, c, dp);
        return dp[r][c] = arr[r][c] + Math.min(down , Math.min(dl,dr));
    }
}