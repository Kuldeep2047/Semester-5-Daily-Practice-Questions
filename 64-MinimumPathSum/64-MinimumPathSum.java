// Last updated: 9/6/2025, 10:26:34 PM
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return answer(grid, dp, 0,0);
        
    }
    public int answer(int[][] arr,int[][]dp,int r,int c){
        if(r == arr.length-1 && c == arr[0].length-1){
            return arr[r][c];
        }
        if(r>=arr.length || c>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        int right = answer(arr,dp,r,c+1);
        int down = answer(arr,dp,r+1,c);
        return dp[r][c] = arr[r][c] + Math.min(right,down);
    }
}