// Last updated: 8/9/2025, 1:45:39 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        // int count=0;
        // int c=1;
        int n=nums.length;
        int k=2;
        for(int i=2;i<n;i++){
            if(nums[i] != nums[k-2]){
                nums[k++] = nums[i];
            }
        }
        
        return k;

    }
  
}