// Last updated: 10/6/2025, 11:44:37 AM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp ,-1);
        return answer(nums);
        // return Max_Rob(nums, 0 , dp);
    }

    // public static int Max_Rob(int[] arr, int idx, int[] dp){
    //     if(idx >= arr.length){
    //         return 0;
    //     }

    //     if(dp[idx] != -1){
    //         return dp[idx];
    //     }

    //     int not_rob = Max_Rob(arr, idx +1, dp);
    //     int rob = arr[idx] + Max_Rob(arr, idx +2, dp);
    //     return dp[idx] = Math.max(not_rob, rob);
    // }

    public int answer(int[] arr){
        int prev2 =0;
        int prev =arr[0];
        for(int i=1;i<arr.length ;i++){
            int pick = arr[i] + prev2;
            int not_pick = prev;
            int curr = Math.max(pick, not_pick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}