// Last updated: 10/4/2025, 10:10:42 PM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp ,-1);

        return Max_Rob(nums, 0 , dp);
    }

    public static int Max_Rob(int[] arr, int idx, int[] dp){
        if(idx >= arr.length){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int not_rob = Max_Rob(arr, idx +1, dp);
        int rob = arr[idx] + Max_Rob(arr, idx +2, dp);
        return dp[idx] = Math.max(not_rob, rob);
    }
}