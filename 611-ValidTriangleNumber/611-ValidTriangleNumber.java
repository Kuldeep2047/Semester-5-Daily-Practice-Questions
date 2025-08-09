// Last updated: 8/9/2025, 1:42:43 PM
class Solution {
    public int triangleNumber(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int start=0;
            int end=i-1;
            while(start<end){
                if(nums[start]+nums[end]>nums[i]){
                    sum+=end-start;
                    end--;
                }else{
                    start++;
                }
            }
        }
        return sum;
    }
}