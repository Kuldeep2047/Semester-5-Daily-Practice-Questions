// Last updated: 8/9/2025, 1:39:58 PM
class Solution {
    public int totalMoney(int n) {
        return answer(n);
    }
    public static int answer(int n){
        int sum =0;
        int d = n/7;        //full weeks
        int r = n%7;        //remaining days
        int prev_mon =1;
        while(d-- >0){
            int a = prev_mon;
            int l = a+6;
            sum += (7 * (a + l)) / 2;
            prev_mon++;
        }
        for(int i=0;i<r;i++){
            sum += prev_mon +i;
        }


        // n = r;
        // sum += ((n*prev_mon)+(n*(prev_mon+r-1)))/2;       
        return sum;
    }
}