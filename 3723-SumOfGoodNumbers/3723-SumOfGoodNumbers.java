// Last updated: 8/9/2025, 1:36:58 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        return Good_Numbers(nums,k);
    }
    public static int Good_Numbers(int[] nums,int k){
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i-k>=0 && i+k<n){
                if(nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                    sum+=nums[i];
                }
            }else if(i+k<n && nums[i]>nums[i+k]){
                sum+=nums[i];
            }else if(i-k>=0 && nums[i]>nums[i-k]){
                sum+=nums[i];
            }
        }
        return sum;
    }
}