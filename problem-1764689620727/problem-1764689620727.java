// Last updated: 12/2/2025, 9:03:40 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        String s = String.valueOf(n);
4        StringBuilder sb = new StringBuilder();
5
6        long num = 0;
7        long sum =0;
8        for(int i=0 ;i<s.length() ;i++){
9            char ch = s.charAt(i);
10            if(ch != '0'){
11                // long a = Long.parseLong(ch);
12                long a = ch - '0';
13                num = num *10 + a;
14                sum += a;
15                
16            }
17        }
18        return sum * num;
19    }
20}