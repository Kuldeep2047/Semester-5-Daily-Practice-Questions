// Last updated: 1/3/2026, 12:03:36 PM
1class Solution {
2    public int fib(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp ,-1);
5        return answer(n, dp);
6
7    }
8    public int answer(int n, int[] dp){
9        if(n == 0 || n ==1){
10            return n;
11        }
12        if(dp[n] != -1){
13            return dp[n];
14        }
15
16        return dp[n] = answer(n-1, dp) + answer(n-2, dp);
17    }
18}