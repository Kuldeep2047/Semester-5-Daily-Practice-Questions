// Last updated: 8/9/2025, 1:39:49 PM
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
               
                c++;
            }
        }
       if(c==0){
        return true;
       }
       if(c==1 && nums[0]>=nums[nums.length-1]){
        return true;
       }
       return false;
        
    }
}