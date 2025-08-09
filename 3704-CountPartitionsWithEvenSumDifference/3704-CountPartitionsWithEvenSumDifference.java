// Last updated: 8/9/2025, 1:37:06 PM
class Solution {
    public int countPartitions(int[] nums) {
        return Count_Partition(nums);
    }
    public static int Count_Partition(int[] nums){
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int even=0;
        // int odd = 0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            even += nums[i];
            int odd = total-even;
            if(Math.abs(even-odd)%2==0){
                c++;
            }
        }
        return c;
    }
}