// Last updated: 8/18/2025, 9:38:37 PM
class Solution {
    public int climbStairs(int n) {
        return stairs(n);
    }

    public int stairs(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        
        int a = 1;
        int b = 2;
        for(int i=3;i<=n;i++){
            int curr = a+b;
            a = b;
            b = curr;

        }
        return b;
    }
}