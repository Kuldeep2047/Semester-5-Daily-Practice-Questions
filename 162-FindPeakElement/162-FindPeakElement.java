// Last updated: 8/9/2025, 1:44:51 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left<right) {
            int mid = (left+right)/2;

            if(nums[mid]<nums[mid+1]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
        
    }
}