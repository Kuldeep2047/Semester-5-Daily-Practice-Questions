// Last updated: 12/23/2025, 12:43:07 AM
1class Solution {
2    public int numWays(String s) {
3        return answer(s);
4    }
5    public int answer(String s){
6        int n = s.length();
7        int total =0;   //count one
8        for(int i=0 ;i<n ;i++){
9            if(s.charAt(i) == '1'){
10                total++;
11            }
12        }
13        if(total %3 != 0){
14            return 0;
15        }
16        else if(total == 0){
17            long ans = (long)(n-1)*(n-2)/2;
18            return (int)(ans % 1000000007);
19        }
20        else{
21            long cutone = 0;
22            long cuttwo = 0;
23            int k = total /3;
24            int one =0;
25
26            for(int i=0 ;i<n ;i++){
27                if(s.charAt(i) == '1'){
28                    one++;
29                }
30                if(one == k){
31                    cutone++;
32                }
33                else if(one == 2*k){
34                    cuttwo++;
35                }
36            }
37            return (int)((cutone * cuttwo) % 1000000007);
38
39        }
40    }
41}