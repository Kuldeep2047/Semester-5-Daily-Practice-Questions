// Last updated: 8/9/2025, 1:42:56 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        return subarray_sum(nums,k);
    }
    public static int subarray_sum(int[] nums,int k){
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}