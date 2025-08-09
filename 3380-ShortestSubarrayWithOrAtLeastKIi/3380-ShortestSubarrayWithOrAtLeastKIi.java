// Last updated: 8/9/2025, 1:37:21 PM
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        return minlength(nums,k);
    }

    public static int minlength(int[] nums,int k){
        if(k==0){
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum |= nums[i];

            if(sum>=k){
                int sum2=0;
                int j=i;
                while(sum2<k){
                    sum2 |= nums[j];
                    j--;
                }
                ans = Math.min(ans,i-j);
                sum=0;
                i=j+2;
            }
        }
        
         return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}