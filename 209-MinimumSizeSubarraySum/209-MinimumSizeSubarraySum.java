// Last updated: 8/9/2025, 1:44:30 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return minlen(target,nums);
    }
    public static int minlen(int target,int[] nums){
        int si=0,ei=0;
        int sum=0;
        int ans = Integer.MAX_VALUE;
        while(ei<nums.length){
            sum += nums[ei];
            while(sum>=target && si<=ei){
                ans = Math.min(ans,ei-si+1);
                sum -= nums[si];
                si++;
            }
            ei++;
        }
        return ans==Integer.MAX_VALUE ?0 : ans;
    }
}