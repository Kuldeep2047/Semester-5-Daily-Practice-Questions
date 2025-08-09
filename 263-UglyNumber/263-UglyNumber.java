// Last updated: 8/9/2025, 1:44:08 PM
class Solution {
    public boolean isUgly(int n) {
        return Ugly(n);
    }
    public static boolean Ugly(int n){
        if(n<=0){
            return false;
        }
        int[] fact = {2,3,5};
        for(int f : fact){
            while(n%f==0){
                n=n/f;
            }
        }
        return n==1;
    }
}