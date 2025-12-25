// Last updated: 12/26/2025, 12:17:07 AM
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        return answer(str1, str2);
4    }
5
6    public String answer(String a ,String b){
7
8
9        int n = a.length();
10        int m = b.length();
11        int[][] dp = new int[n + 1][m + 1];
12
13        // LCS DP
14        for(int i=n -1; i >= 0; i--){
15            for(int j = m - 1; j >= 0; j--){
16                if(a.charAt(i) == b.charAt(j)){
17                    dp[i][j] = 1 + dp[i + 1][j + 1];
18                }
19                else{
20                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
21                }
22            }
23        }
24
25
26
27        StringBuilder sb = new StringBuilder();
28        int i=0 ;
29        int j=0;
30
31        while(i<a.length() && j<b.length()){
32            char c1 = a.charAt(i);
33            char c2 = b.charAt(j);
34            if(c1 == c2){
35                sb.append(c1);
36                i++;
37                j++;
38            }
39            else if(dp[i + 1][j] >= dp[i][j + 1]){
40                sb.append(c1);
41                i++;
42            }else{
43                sb.append(c2);
44                j++;
45            }
46        }
47
48        while(i< a.length()){
49            sb.append(a.charAt(i));
50            i++;
51        }
52        while(j<b.length()){
53            sb.append(b.charAt(j));
54            j++;
55        }
56
57        return sb.toString();
58    }
59}