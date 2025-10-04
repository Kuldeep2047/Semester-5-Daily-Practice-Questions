// Last updated: 10/4/2025, 10:16:13 PM
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSum(nums);
        
    }
    public static int maxSum(int[] arr){
        int sum =0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length ;i++){
            sum += arr[i];
            ans = Math.max(ans, sum);
            if(sum < 0){
                sum =0;

            }

        }
        return ans;
    }
}