// Last updated: 1/3/2026, 12:17:07 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp ,-1);
5        return answer(n, dp);
6    }
7    public int answer(int n, int[] dp){
8        if(n== 0 || n==1){
9            return 1;
10        }
11        if(dp[n] != -1){
12            return dp[n];
13        }
14        
15        int a = answer(n-1, dp);
16        int b = answer(n-2, dp);
17
18        return dp[n] = a + b;
19    }
20}