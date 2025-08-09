// Last updated: 8/9/2025, 1:40:03 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int c=0;
        while(start<end){
            int num = nums[start]+nums[end];
            if(num==k){
                c++;
                start++;
                end--;
            }else if(num>k){
                end--;
            }else{
                start++;
            }
        }
        return c;
        
    }
}