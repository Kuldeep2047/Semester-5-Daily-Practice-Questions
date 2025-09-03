// Last updated: 9/3/2025, 11:53:52 AM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        // return Robber(nums,0,dp);
        return RobberBU(nums);
        
    }
    public static int RobberBU(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0],arr[1] );
		for(int i=2;i<dp.length;i++) {
			int rob = arr[i] + dp[i-2];
			int Dont_rob = dp[i-1];
			dp[i] = Math.max(rob, Dont_rob);
		}
		return dp[dp.length - 1];
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