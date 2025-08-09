// Last updated: 8/9/2025, 1:37:26 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int n:nums){
            if(n<k){
                c++;
            }
        }
        return c;
        
    }
}