// Last updated: 8/9/2025, 1:38:45 PM
class Solution {
    public int triangularSum(int[] nums) {
        return Triangle_Sum(nums,nums.length);
    }
    public static int Triangle_Sum(int[] nums,int n){
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            nums[i]= (nums[i]+nums[i+1])%10;
        }
        return Triangle_Sum(nums,n-1);
    }
}