// Last updated: 8/9/2025, 1:45:12 PM
class Solution {
    public int singleNumber(int[] nums) {
        int n=0;
        for(int i:nums){
            n^=i;
        }
        return n;
    }
}