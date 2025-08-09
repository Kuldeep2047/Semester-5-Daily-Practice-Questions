// Last updated: 8/9/2025, 1:43:11 PM
class Solution {
    public int minMoves2(int[] nums) {
        int move=0;
        Arrays.sort(nums);
        int mid = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<=mid){
                move+=nums[mid]-nums[i];
            }else{
                move+=nums[i]-nums[mid];
            }
        }
        return move;
        
    }
}