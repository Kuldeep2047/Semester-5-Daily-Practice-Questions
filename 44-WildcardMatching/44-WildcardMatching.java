// Last updated: 10/6/2025, 10:07:14 AM
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()][p.length()];
        for(int[] ar : dp){
            Arrays.fill(ar, -1);
        }

        return Wildcard_Matching(s, p, s.length()-1, p.length()-1, dp);
    }

    public boolean Wildcard_Matching(String s ,String p , int i ,int j, int[][] dp){
        //base case
        if(i < 0  && j < 0){
            return true;
        }
        if(i>=0 && j<0){
            return false;
        }
        if(i<0 && j>=0){
            for(int k = 0 ;k<=j; k++){
                if(p.charAt(k) != '*'){
                    return false;
                }
            }
            return true;
        }

        if(dp[i][j] != -1){
            if(dp[i][j] == 1){
                return true;
            }else{
                return false;
            }
        }

        //logic
        boolean match;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            match = Wildcard_Matching(s, p, i-1 ,j-1, dp);
        }
        else if(p.charAt(j)== '*'){
            boolean a = Wildcard_Matching(s, p, i-1, j, dp);
            boolean b = Wildcard_Matching(s, p, i ,j-1, dp);
            match = a || b;
        }else{
            match = false;
        }

        
       if (match == true) {
            dp[i][j] = 1;
        } else {
            dp[i][j] = 0;
        }

        return match;
    }
}