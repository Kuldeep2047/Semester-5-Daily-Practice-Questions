// Last updated: 8/29/2025, 12:27:40 PM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber(nums,0,dp);
        
    }
    public int Robber(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + Robber(nums, i+2,dp);
        int not_rob = Robber(nums,i+1, dp);
        return dp[i] = Math.max(rob, not_rob);
    }
}