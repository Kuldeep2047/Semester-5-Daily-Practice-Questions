// Last updated: 8/9/2025, 1:45:13 PM
class Solution {
    public int candy(int[] ratings) {
        return Total_Candies(ratings);
    }
    public static int Total_Candies(int[] nums){
        int[] ans = new int[nums.length];
        int sum=0;
        for(int i=0;i<ans.length;i++){
            ans[i] = 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ans[i] = ans[i-1]+1;
            }
        }

        for(int i = nums.length-2 ;i>=0;i--){
            if(nums[i]>nums[i+1]){
                ans[i] = Math.max(ans[i],ans[i+1]+1);
            }
        }
        for(int i=0;i<ans.length;i++){
            sum += ans[i];
        }

        return sum;
    }
}