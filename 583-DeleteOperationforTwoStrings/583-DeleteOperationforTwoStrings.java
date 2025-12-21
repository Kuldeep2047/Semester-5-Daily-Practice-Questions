// Last updated: 12/21/2025, 1:51:57 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        return answer(word1, word2);
4    }
5
6    public int answer(String s1, String s2){
7        int n = s1.length();
8        int m = s2.length();
9        int[][] dp = new int[n][m];
10
11		for (int[] a : dp) {
12			Arrays.fill(a, -1);
13		}
14        int lcs = LCS(s1,s2,0,0,dp);
15
16        return (n- lcs) + (m- lcs);
17
18
19    }
20
21    public static int LCS(String s1, String s2, int i, int j, int[][] dp) {
22		if (i == s1.length() || j == s2.length()) {
23			return 0;
24		}
25		if (dp[i][j] != -1) {
26			return dp[i][j];
27		}
28		int ans = 0;
29		if (s1.charAt(i) == s2.charAt(j)) {
30			ans = 1 + LCS(s1, s2, i + 1, j + 1, dp);
31		} else {
32			int f = LCS(s1, s2, i + 1, j, dp);
33			int s = LCS(s1, s2, i, j + 1, dp);
34			ans = Math.max(f, s);
35
36		}
37		return dp[i][j] = ans;
38	}
39}