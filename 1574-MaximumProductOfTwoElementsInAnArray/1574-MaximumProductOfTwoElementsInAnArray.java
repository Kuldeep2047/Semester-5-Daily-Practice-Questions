// Last updated: 8/9/2025, 1:40:29 PM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-2]-1) * (nums[nums.length-1]-1);
    }
}