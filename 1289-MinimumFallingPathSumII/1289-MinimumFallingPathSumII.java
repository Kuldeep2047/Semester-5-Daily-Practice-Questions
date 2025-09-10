// Last updated: 9/10/2025, 12:39:05 PM
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
    public static int answer(int[][] arr, int r,int c,int[][] dp){
        
        if(r == arr.length-1){
            return arr[r][c];
        }
        if(dp[r][c] != -100000){
            return dp[r][c];
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length;i++) {
        	if(i==c) {
        		continue;
        	}
        	ans = Math.min(ans, answer(arr,r+1,i,dp));
        }
        return dp[r][c] = arr[r][c] + ans;
    }
}