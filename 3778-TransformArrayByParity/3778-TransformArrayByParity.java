// Last updated: 8/9/2025, 1:36:45 PM
class Solution {
    public int[] transformArray(int[] nums) {
        return array(nums);
    }
    public static int[] array(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
        
    }
}