// Last updated: 1/4/2026, 4:06:21 PM
1class Solution {
2    public int countSquares(int[][] matrix) {
3        return answer(matrix);
4    }
5
6    public int answer(int[][] arr){
7        int  n = arr.length;
8        int m = arr[0].length;
9        int[][] dp = new int[n][m];
10        int ans =0;
11
12        for(int i=0 ;i<n ;i++){
13            for(int j=0 ;j<m ;j++){
14                if(i == 0 || j ==0 ){
15                    dp[i][j] = arr[i][j];
16                }else{
17                    if(arr[i][j] == 1){
18                        dp[i][j] = 1+  Math.min(dp[i][j-1], Math.min(dp[i-1][j-1], dp[i-1][j]));
19                    }else{
20                        dp[i][j] = 0;
21                    }
22                }
23                ans += dp[i][j];
24
25            }
26        }
27        return ans;
28    }
29}