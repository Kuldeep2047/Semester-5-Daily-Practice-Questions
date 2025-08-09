// Last updated: 8/9/2025, 1:36:52 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        return Maximum_Difference(nums);
    }
    public static int Maximum_Difference(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            int a = Math.abs(nums[i]-nums[i-1]);
            ans = Math.max(ans,a);
        }
        return Math.max(ans,Math.abs(nums[0]-nums[nums.length-1]));
    }
}