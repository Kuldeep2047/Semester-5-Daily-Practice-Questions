// Last updated: 8/9/2025, 1:44:07 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int tsum = (n*(n+1))/2;
        return tsum-sum;
        
    }
}