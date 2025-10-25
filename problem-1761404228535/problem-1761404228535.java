// Last updated: 10/25/2025, 8:27:08 PM
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9 || sum <1){
            return "";
        }
        return answer(num, sum);
    }

    public static String answer(int n, int sum){
        
        StringBuilder sb = new StringBuilder(n);

        for(int i=0 ;i<n;i++){
            int d = Digit(i, n,sum);

            sb.append((char)(d + '0'));
            sum -= d;
        }

        return sb.toString();
    }

    public static int Digit(int idx, int l, int s){
        int low =0;
        if(idx == 0){
            low =1;
        }

        int rem = l - idx -1;
        int need = s - 9*rem;
        int ans = Math.min(9, s);

        if(need > ans){
            ans = need;
        }
        if(ans < low){
            ans = low;
        }

        return ans;
        
    }
    
}