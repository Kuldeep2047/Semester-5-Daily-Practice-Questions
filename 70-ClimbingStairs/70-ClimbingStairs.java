// Last updated: 10/6/2025, 11:09:27 AM
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp ,-1);

        return answer(n, dp, 0);
    }
    public int answer(int n, int[] dp ,int idx){
        if(idx == n){
            return 1;
        }
        if(idx > n){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int a = answer(n , dp ,idx+1);
        int b = answer(n, dp, idx+2);
        return dp[idx] = a+b;

    }
}