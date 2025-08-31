// Last updated: 8/31/2025, 12:39:20 PM
class Solution {
    public int fib(int n) {
        int[] dp  = new int[n+1];
        Arrays.fill(dp,-1);
        return answer(n,dp);
    }
    public int answer(int n,int[] dp){
        if(n==1 || n==0){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = answer(n-1, dp) + answer(n-2, dp);
    }
}