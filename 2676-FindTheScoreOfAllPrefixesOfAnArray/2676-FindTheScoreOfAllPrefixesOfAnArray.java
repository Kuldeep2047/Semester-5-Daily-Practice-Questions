// Last updated: 8/9/2025, 1:37:58 PM
class Solution {
    public long[] findPrefixScore(int[] nums) {
        return Prefix_Array(nums);
    }
    public static long[] Prefix_Array(int[] nums){
        long[] ans = new long[nums.length];
        int max = nums[0];
        ans[0] = nums[0]+max;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            ans[i] = nums[i]+max+ans[i-1];
        }
        return ans;
    }
}