// Last updated: 8/9/2025, 1:40:26 PM
class Solution {
    public int[] runningSum(int[] nums) {
        return Running_Sum(nums);
    }
    public static int[] Running_Sum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}