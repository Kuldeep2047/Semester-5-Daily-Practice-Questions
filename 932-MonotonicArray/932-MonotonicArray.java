// Last updated: 8/9/2025, 1:41:57 PM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int f1=1;
        int f2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                f1++;
            }
            if(nums[i]>=nums[i+1]){
                f2++;
            }
        }
        if(f1==nums.length || f2==nums.length){
            return true;
        }else{
            return false;
        }
        
    }
}