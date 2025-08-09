// Last updated: 8/9/2025, 1:44:11 PM
class Solution {
    public int addDigits(int num) {
        int ans=num;
        while(ans>=10){
            ans = Digit_Sum(ans);
        }
        return ans;
    }
    public static int Digit_Sum(int n){
        int sum=0;
        while(n>0){
            sum+= n%10;
            n=n/10;
        }
        return sum;
    }
}