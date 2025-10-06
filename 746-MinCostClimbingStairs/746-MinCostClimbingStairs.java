// Last updated: 10/6/2025, 11:26:00 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp ,-1);
        int zero = helper(cost, dp, 0);
        int one = helper(cost, dp ,1);
        return Math.min(one , zero);
    }
    public int helper(int[] cost, int[] dp ,int idx){
        if(idx >= cost.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int one = cost[idx] + helper(cost, dp ,idx+1);
        int two = cost[idx] + helper(cost, dp ,idx+2);
        return dp[idx] = Math.min(one ,two);
    }
}