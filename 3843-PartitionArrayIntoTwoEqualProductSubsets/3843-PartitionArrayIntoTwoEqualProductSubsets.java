// Last updated: 8/9/2025, 1:36:26 PM
class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        return answer(nums,target);
    }
    public static boolean answer(int[] nums,long target){
        long p =1;
        for(int n:nums){
            p = p*n;
        }
        return p == target*target;
    }
        
    
}