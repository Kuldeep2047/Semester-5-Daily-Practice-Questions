// Last updated: 8/9/2025, 1:37:45 PM
class Solution {
    public long maxArrayValue(int[] nums) {
        return largest_element(nums);
    }
    public static long largest_element(int[] nums){
        long sum=nums[nums.length-1];
        long ans = sum;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<=sum){
                sum += nums[i];
            }else{
                ans = Math.max(ans,sum);
                sum = nums[i];
            }
        }
        return Math.max(ans,sum);
        
    }
}