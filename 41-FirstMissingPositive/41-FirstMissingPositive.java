// Last updated: 8/9/2025, 1:46:18 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        return missing_positive(nums);
    }
    public static int missing_positive(int[] nums){
        
        Arrays.sort(nums);
        int positive = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive = i;
                break;
            }  
        }
        if(nums[positive]>1){
            return 1;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!= nums[i+1] && nums[i+1]-nums[i]>1 && nums[i]>0){
                return nums[i]+1;
            }
        }
        if(nums[nums.length-1]<0){
            return 1;
        }
        return nums[nums.length-1]+1;
    }
}