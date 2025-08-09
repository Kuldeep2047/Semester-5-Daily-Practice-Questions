// Last updated: 8/9/2025, 1:37:29 PM
class Solution {
    public boolean canSortArray(int[] nums) {
        return isSort(nums);
    }
    public static boolean isSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    if(Integer.bitCount(nums[i])==Integer.bitCount(nums[j])){
                        swap(nums,i,j);
                    }else{
                        return false;
                    }
                }
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] nums,int i,int j){
        int temp=nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}