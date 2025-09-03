// Last updated: 9/3/2025, 12:35:48 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        // return answer(0,-1,nums,nums.length);
        return answer2(nums);
    }
    public int answer2(int[] arr){
        int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for(int i=1;i<dp.length;i++) {
			for(int j = i-1; j>=0;j--) {
				if(arr[i]>arr[j]) {
					int x = dp[j];
					dp[i] = Math.max(dp[i], x+1);
				}
			}
		}
		return Arrays.stream(dp).max().getAsInt();
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