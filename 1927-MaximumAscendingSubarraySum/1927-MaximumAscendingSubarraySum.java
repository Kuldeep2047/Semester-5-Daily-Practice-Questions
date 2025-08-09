// Last updated: 8/9/2025, 1:39:34 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        return maxsum(nums);
    }
    public static int maxsum(int[] nums){
        int sum=nums[0];
        int ans =0;
        ans = Math.max(ans,sum);
        int ei=1;
        while(ei<nums.length){
            if(nums[ei]>nums[ei-1]){
                sum+=nums[ei];
            }else{
                sum = nums[ei];
            }
            ans = Math.max(ans,sum);
            ei++;
        }
        return ans;
    }
}