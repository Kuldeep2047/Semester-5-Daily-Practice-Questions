// Last updated: 10/13/2025, 9:36:37 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] nums){
        int idx =0;
        int n = nums.length;
        for(int i=0;i<n ;i++){
            if( i<n-1 && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}