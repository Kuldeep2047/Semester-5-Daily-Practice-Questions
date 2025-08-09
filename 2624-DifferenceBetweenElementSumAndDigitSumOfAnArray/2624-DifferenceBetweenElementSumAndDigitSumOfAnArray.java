// Last updated: 8/9/2025, 1:38:11 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        return Difference(nums);
    }
    public static int Difference(int[] nums){
        int sum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            dsum+=Digit_Sum(nums[i]);
        }
        return Math.abs(sum-dsum);
    }
    public static int Digit_Sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}