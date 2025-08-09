// Last updated: 8/9/2025, 1:43:29 PM
class Solution {
    public int maxRotateFunction(int[] nums) {
        return max_rotate(nums);
    }
    public static int max_rotate(int[] nums){
        int n = nums.length;
        int sum =0;
        int pre=0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            pre += nums[i]*i;
        }
        int ans = pre;
        for(int i=nums.length-1;i>0;i--){
            int rotate = nums[i];
            pre = pre -(rotate*(n-1))+(sum-rotate);
            ans = Math.max(ans,pre);
        }
        return ans;
    }
}