// Last updated: 1/3/2026, 12:52:18 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        return answer(numRows);     
4        
5    }
6    // public List<List<Integer>> answer(int n){
7    //     List<List<Integer>> ans = new ArrayList<>();
8
9    //     for(int i=1; i<=n; i++) {
10    //         List<Integer> ll = new ArrayList<>();
11    //         int res = 1;
12    //         ll.add(res);
13    //         for(int j=1; j<i; j++) {
14    //             res = res * (i-j);
15    //             res = res / j;
16    //             ll.add(res);
17    //         } 
18    //         ans.add(ll);
19    //     }
20    //     return ans;
21    // }
22
23    public static List<List<Integer>> answer(int n){
24        int[][] dp = new int[n][n];
25        for(int[] a : dp){
26            Arrays.fill(a, -1);
27        }
28        List<List<Integer>> ans = new ArrayList<>();
29        for(int i=0 ;i<n ;i++){
30            List<Integer> ll = new ArrayList<>();
31            for(int j=0 ;j<=i ;j++){
32                ll.add(pascal(i, j, dp));
33            }
34
35            ans.add(ll);
36        }
37
38        return ans;
39    }
40    public static int pascal(int r, int c, int[][] dp){
41
42        if(c == 0 || c==r){
43            return 1;
44        }
45        if(dp[r][c] != -1){
46            return dp[r][c];
47        }
48
49        return dp[r][c] = pascal(r-1, c-1, dp) + pascal(r-1, c, dp);
50
51    }
52}