// Last updated: 11/30/2025, 2:35:58 PM
1class Solution {
2    public int numberOfArrays(String s, int k) {
3        int[] dp = new int[s.length()+1];
4        Arrays.fill(dp, -1);
5        // return answer(s, k, dp); --> MLE occur in this
6        return answer2(0, s, k, dp);
7    }
8    public int answer2(int idx, String s , int k, int[] dp){
9        if(idx == s.length()){
10            return 1;
11        }
12        if(s.charAt(idx) == '0'){
13            return 0;
14        }
15
16        if(dp[idx] != -1){
17            return dp[idx];
18        }
19
20        int mod = 1000000007;
21
22        int ans =0;
23        long num=0;
24
25        for(int cut = idx; cut < s.length() ;cut++){
26            
27            num = num * 10 + (s.charAt(cut)-'0');
28
29            if(num>k){
30                break;
31            }
32            ans = (ans + answer2(cut+1,  s, k , dp)) % mod;
33        }
34
35        return dp[idx] = ans;
36    }
37
38    // public int answer(String s , int k, int[] dp){
39    //     if(s.length() == 0){
40    //         return 1;
41    //     }
42    //     if(s.charAt(0) == '0'){
43    //         return 0;
44    //     }
45
46    //     if(dp[s.length()] != -1){
47    //         return dp[s.length()];
48    //     }
49
50    //     int mod = 1000000007;
51
52    //     int ans =0;
53
54    //     for(int cut = 1; cut <= s.length() ;cut++){
55    //         String st = s.substring(0,cut);
56    //         long num = Long.parseLong(st);
57
58    //         if(num>k){
59    //             break;
60    //         }
61    //         ans = (ans + answer( s.substring(cut), k , dp)) % mod;
62    //     }
63
64    //     return dp[s.length()] = ans;
65    // }
66}