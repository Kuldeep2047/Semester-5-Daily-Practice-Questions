// Last updated: 9/2/2025, 4:15:18 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int zero = answer(cost,0,dp);
        int first = answer(cost,1,dp);
        return Math.min(zero,first);
    }
    public int answer(int[] arr,int idx, int[] dp){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int jump1 = answer(arr,idx+1,dp);
        int jump2 = answer(arr,idx+2,dp);
        return dp[idx] = arr[idx] + Math.min(jump1,jump2);
    }
}