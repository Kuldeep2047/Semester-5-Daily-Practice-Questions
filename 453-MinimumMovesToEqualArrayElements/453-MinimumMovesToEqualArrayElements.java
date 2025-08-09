// Last updated: 8/9/2025, 1:43:13 PM
class Solution {
    public int minMoves(int[] nums) {
        int move=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            c+=nums[i]-min;
        }
        return c;
    }
}