// Last updated: 8/9/2025, 1:45:50 PM
class Solution {
    public int[] plusOne(int[] digits) {
        return Plus_One(digits);
    }
    public int[] Plus_One(int[] digits){
        int n = digits.length;
        int[] nums = new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        nums[0] =1;
        return nums;
    }
}