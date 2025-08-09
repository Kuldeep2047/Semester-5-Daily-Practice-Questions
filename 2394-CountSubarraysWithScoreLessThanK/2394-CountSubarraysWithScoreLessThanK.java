// Last updated: 8/9/2025, 1:38:34 PM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        return no_of_subarray(nums,k);
    }
    public static long no_of_subarray(int[] nums,long k){
        int si=0,ei=0;
        long c=0;
        long sum=0;
        while(ei<nums.length){
            sum +=nums[ei];
            
            while(sum*(ei-si+1)>=k && si<=ei){
                sum -= nums[si];
                si++;
            }
            
            c += ei-si+1;
            ei++;
        }
        return c;
    }
}