// Last updated: 1/4/2026, 11:12:14 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] dp = new int[text1.length()][text2.length()];
4        for(int[] a : dp){
5            Arrays.fill(a, -1);
6        }
7        return answer(text1, text2, 0,0, dp);
8    }
9    public int answer(String s1, String s2, int i, int j, int[][] dp){
10        if(i == s1.length() || j == s2.length()){
11            return 0;
12        }
13
14        if(dp[i][j] != -1){
15            return dp[i][j];
16        }
17        int ans =0;
18        if(s1.charAt(i) == s2.charAt(j)){
19            ans = 1 + answer(s1, s2, i+1, j+1, dp);
20        }else{
21            int a= answer(s1, s2, i, j+1, dp);
22            int b = answer(s1, s2, i+1, j, dp); 
23            ans = Math.max(a,b);
24        }
25        return  dp[i][j] = ans;
26    }
27
28}