// Last updated: 12/19/2025, 4:58:40 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp = new int[word1.length()][word2.length()];
4
5        for(int[] arr : dp){
6            Arrays.fill(arr, -1);
7        }
8
9        return Min_Ops(word1,word2,0,0, dp);
10    }
11    public static int Min_Ops(String s, String t, int i,int j, int[][] dp) {
12		if(i == s.length()) {
13			return t.length() -j;
14		}
15		if(j == t.length()) {
16			return s.length() - i;
17		}
18        if(dp[i][j] != -1){
19            return dp[i][j];
20        }
21		
22		int ans =0;
23		if(s.charAt(i) == t.charAt(j)) {
24			ans = Min_Ops(s, t, i+1, j+1, dp);
25		}else {
26			int D = Min_Ops(s, t, i+1, j, dp);
27			int R = Min_Ops(s, t, i+1, j+1, dp);
28			int I = Min_Ops(s, t, i, j+1, dp);
29			ans = Math.min(D,  Math.min(R, I))+1;
30		}
31		return dp[i][j] = ans;
32	}
33}