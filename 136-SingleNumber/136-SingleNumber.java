// Last updated: 11/27/2025, 12:20:12 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int n=0;
4        for(int i:nums){
5            n^=i;
6        }
7        return n;
8    }
9}