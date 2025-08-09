// Last updated: 8/9/2025, 1:36:48 PM
class Solution {
    public long maximumMedianSum(int[] nums) {
        return answer(nums);
    }
    public static long answer(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int first_ele_idx = n/3;
        long sum =0;
        // int sum = nums[first_ele_idx];

        for(int i=first_ele_idx; i<n;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}