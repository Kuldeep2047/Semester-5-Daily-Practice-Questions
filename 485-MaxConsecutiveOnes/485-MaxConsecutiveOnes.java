// Last updated: 8/9/2025, 1:43:09 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }else{
                ans = Math.max(ans,c);
                c=0;
            }
        }
        ans = Math.max(ans,c);
        return ans;
        
    }
}