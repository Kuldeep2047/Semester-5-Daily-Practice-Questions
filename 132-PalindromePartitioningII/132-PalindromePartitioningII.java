// Last updated: 10/24/2025, 3:24:11 PM
class Solution {
    
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp ,-1);

        boolean[][] isPal = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                }
            }
        }

       return answer(s, 0, n, dp, isPal) - 1; 
       
    }
// constant time me palindrome check kerne ke  liye 2-d DP (isPal) ka use kiya hai

    public static int answer(String s, int idx, int n, int[] dp, boolean[][] isPal){
        if(idx == n){
            return 0;
        }
        
        if(dp[idx] != -1){
            return dp[idx];
        }

        String temp = "";
        int ans = Integer.MAX_VALUE;

        for(int i= idx ;i<n ;i++){
            // temp += s.charAt(i);
            if(isPal[idx][i]){

                int cuts = 1 + answer(s, i+1, n, dp, isPal);
                
                ans = Math.min(ans, cuts);
            }
        }
        return dp[idx] = ans;
    }

    // public static boolean isPalindrome(String s){
    //     int i =0;
    //     int j = s.length()-1;

    //     while(i<=j){
    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

}