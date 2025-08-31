// Last updated: 8/31/2025, 10:24:24 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        // return answer(0,-1,nums,nums.length);
        return answer2(nums);
    }
    public int answer2(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        int ans = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }







    // = > This give TLE
    // public int answer(int idx, int prev, int[] arr, int n){
    //     if(idx == n){
    //         return 0;
    //     }
    //     int len = 0 + answer(idx+1, prev, arr,n);
    //     if(prev == -1 || arr[idx]>arr[prev]){
    //         len = Math.max(len , 1 + answer(idx+1, idx, arr, n));
    //     }
    //     return len;
    // }
}