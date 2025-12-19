// Last updated: 12/19/2025, 4:27:55 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        return answer(s);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8        int start =0;
9        int maxLen = 0;
10
11
12        for(int axis=0 ;axis<n ;axis++){
13            for(int orbit =0 ; axis-orbit>=0 && axis+orbit <n ;orbit++){
14                if(s.charAt(axis - orbit) != s.charAt(axis + orbit)){
15                    break;
16                }
17                int len = 2 * orbit +1;
18                if(len > maxLen){
19                    maxLen = len;
20                    start = axis - orbit;
21                }
22
23
24            }
25        }
26
27        for(double axis=0.5 ;axis<n ;axis++){
28            for(double orbit =0.5 ; axis-orbit>=0 && axis+orbit <n ;orbit++){
29                if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))){
30                    break;
31                }
32                int len = (int)(2 * orbit+1);
33                if(len> maxLen){
34                    maxLen = len;
35                    start = (int)(axis - orbit);
36                }
37                
38            }
39        }
40        return s.substring(start, start+maxLen);
41    }
42}