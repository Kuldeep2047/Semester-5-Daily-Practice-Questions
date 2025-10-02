// Last updated: 10/2/2025, 9:22:03 PM
class Solution {
    public int integerReplacement(int n) {
        
        return Integer_Replacement(n, 0);
        
    }

    public static int Integer_Replacement(long n , int step){
        if(n==1){
            return step;
        }

        if(n % 2==0){
            return Integer_Replacement(n/2, step+1);
        }else{
            int a = Integer_Replacement(n+1, step+1);
            int b = Integer_Replacement(n-1, step+1);
            return Math.min(a,b);
        }
    }
}