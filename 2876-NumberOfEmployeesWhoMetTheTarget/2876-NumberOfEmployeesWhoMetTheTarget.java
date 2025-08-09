// Last updated: 8/9/2025, 1:37:42 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c =0;
        for(int n:hours){
            if(n>=target){
                c++;
            }
        }
        return c;
        
    }
}