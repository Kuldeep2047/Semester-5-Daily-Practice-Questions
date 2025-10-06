// Last updated: 10/6/2025, 2:31:52 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        return Subarray_Sum(target, nums);
    }
    public int Subarray_Sum(int target, int[] arr){
        int n = arr.length;
        int sum =0;
        int si =0;
        int ei =0;

        int ans = Integer.MAX_VALUE;
        while(ei < n){
            sum += arr[ei];
            while(sum >= target && si<=ei){
                ans = Math.min(ans, ei-si+1);
                sum -= arr[si];
                si++;
            }

            ei++;
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}