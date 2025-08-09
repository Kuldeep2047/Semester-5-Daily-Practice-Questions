// Last updated: 8/9/2025, 1:45:52 PM
class Solution {
    public int uniquePaths(int m, int n) {
         int[][] dp = new int[m][n];
        return Path(m-1, n - 1, 0, 0, "",dp);
    }
    // er --> end row
	// ec --> end col
	// cr --> curr row
	// cc --> curr col
    public static int Path(int er, int ec, int cr, int cc, String ans,int[][] dp) {
		if (cr == er && cc == ec) {
			// System.out.println(ans);
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
        if (dp[cr][cc] != 0) return dp[cr][cc];
		int a=Path(er, ec, cr, cc + 1, ans + "H",dp);
		int b=Path(er, ec, cr + 1, cc, ans + "V",dp);
		dp[cr][cc]= a+b;
        return dp[cr][cc];
	}
}