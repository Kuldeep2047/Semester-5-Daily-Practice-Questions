// Last updated: 12/28/2025, 6:58:28 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n];
4        Arrays.fill(dp ,-1);
5
6        return answer(n, dp, 0);
7    }
8    public int answer(int n, int[] dp ,int idx){
9        if(idx == n){
10            return 1;
11        }
12        if(idx > n){
13            return 0;
14        }
15        if(dp[idx] != -1){
16            return dp[idx];
17        }
18        int a = answer(n , dp ,idx+1);
19        int b = answer(n, dp, idx+2);
20        return dp[idx] = a+b;
21
22    }
23}