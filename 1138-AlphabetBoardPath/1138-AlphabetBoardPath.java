// Last updated: 12/22/2025, 2:05:49 PM
1class Solution {
2    public String alphabetBoardPath(String target) {
3        return answer(target);
4    }
5    public String answer(String t){
6        int r =0;
7        int c =0;
8        StringBuilder sb = new StringBuilder();
9
10        for(int i=0 ;i< t.length();i++){
11            char ch = t.charAt(i);
12
13            int nx = (ch -'a') /5;
14            int ny = (ch -'a') %5;
15
16            
17            // for up
18            while(r > nx){
19                sb.append("U");
20                r--;
21            }
22            //for left
23            while(c > ny){
24                sb.append("L");
25                c--;
26            }
27            // for down
28            while(r< nx){
29                sb.append("D");
30                r++;
31            }
32            //for right
33            while(c < ny){
34                sb.append("R");
35                c++;
36            }
37
38            
39
40            sb.append("!");
41        }
42
43        return sb.toString();
44    }
45}