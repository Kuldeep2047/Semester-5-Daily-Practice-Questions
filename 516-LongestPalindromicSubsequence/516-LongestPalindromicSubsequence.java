// Last updated: 11/10/2025, 10:09:56 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        return answer(s, 0, s.length()-1, dp);
    }

    public static int answer(String s, int i, int j, int[][] dp){
        if(i == j){
            return 1;
        }
        if(i>j){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }
        

        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] =  2+ answer(s, i+1 ,j-1, dp);
        }else{
            dp[i][j] =  Math.max(answer(s, i+1, j, dp) , answer(s, i,j-1, dp));
        }
        // return a;

        return dp[i][j];
    }
}