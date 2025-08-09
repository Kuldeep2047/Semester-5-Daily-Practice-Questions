// Last updated: 8/9/2025, 1:36:57 PM
class Solution {
    public int subarraySum(int[] nums) {
        return Sum_Subarrays(nums);
    }
    public static int Sum_Subarrays(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans += Sub_array(nums ,Math.max(0,i-nums[i]),i);
        }
        return ans;
    }
    public static int Sub_array(int[] nums,int i,int j){
        int sum=0;
        while(i<=j){
            sum+=nums[i];
            i++;
        }
        return sum;
    }
}