// Last updated: 8/9/2025, 1:43:57 PM
class Solution {
    public int integerBreak(int n) {
        return Integer_Break(n);
    }
    public static int Integer_Break(int n){
        if(n<=3){
            return n-1;
        }
        int di =n/3;
        int rem = n%3;
        if(rem == 0){
            return (int)Math.pow(3, di);
        }else if(rem == 1){
            return (int)Math.pow(3, di-1)*4;
        }else{
            return (int)Math.pow(3,di)*2;
        }
    }
}