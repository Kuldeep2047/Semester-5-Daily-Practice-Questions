// Last updated: 8/31/2025, 12:59:29 PM
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return answer(n, 0, dp);
    }
    public int answer(int n, int idx, int[] dp){
        if(idx == n){
            return 1;
        }
        if(idx>n){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int one = answer(n, idx+1, dp);
        int two = answer(n, idx+2, dp);
        return dp[idx] = one +two;
    }
}