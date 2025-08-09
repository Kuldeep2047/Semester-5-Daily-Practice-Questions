// Last updated: 8/9/2025, 1:42:59 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        return single_element(nums);
    }
    public static int single_element(int[] nums){
        int start =0;
        int end =nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                start = mid+ 2;
            }else{
                end = mid;
            }
            
        }
        return nums[start];
    }
}