// Last updated: 10/5/2025, 9:53:23 PM
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