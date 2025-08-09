// Last updated: 8/9/2025, 1:44:49 PM
class Solution {
    public int maximumGap(int[] nums) {
        return Maximum_Gap(nums);
    }
    public static int Maximum_Gap(int[] nums){
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int ans =0;
        for(int i=0;i<nums.length-1;i++){
            if(ans<nums[i+1]-nums[i]){
                ans = nums[i+1]-nums[i];
            }
        }
        return ans;
    }
}