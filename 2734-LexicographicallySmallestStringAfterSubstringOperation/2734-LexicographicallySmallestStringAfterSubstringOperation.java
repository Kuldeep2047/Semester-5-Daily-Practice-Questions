// Last updated: 12/24/2025, 12:00:42 PM
1class Solution {
2    public String smallestString(String s) {
3        StringBuilder sb = new StringBuilder(s);
4        return answer(sb);
5    }
6    public String answer(StringBuilder s){
7        int n = s.length();
8        int i=0;
9        while(i<n && s.charAt(i)=='a'){
10            
11            if(i == s.length()-1){
12                s.setCharAt(i, 'z');
13                return s.toString();
14                
15            }
16            i++;
17        }
18        int j = i;
19
20        while(j<n && s.charAt(j) != 'a'){
21            char ch = (char)(s.charAt(j)-1);
22            s.setCharAt(j, ch);
23            j++;
24        }
25
26        return s.toString();
27    }
28}