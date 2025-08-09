// Last updated: 8/9/2025, 1:43:48 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return countNumber(n);
    }
    public static int countNumber(int n){
        if(n==0){
            return 1;
        }
        int ans=10;   //for n==2
        int choice =9;
        int start =9;
        while(n-- >1 ){
            start = start * choice;
            choice--;
            ans += start;
        }
        return ans;
    }
}