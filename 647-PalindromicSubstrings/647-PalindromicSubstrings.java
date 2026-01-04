// Last updated: 1/4/2026, 11:40:01 AM
1class Solution {
2    public int countSubstrings(String s) {
3        return answer(s);
4        
5    }
6
7    public int answer(String s){
8        int n = s.length();
9        int ans =0;
10
11        for(int axis =0 ;axis<n ; axis++){
12            for(int orbit =0 ; (axis-orbit) >=0 && (axis + orbit) < n ; orbit++){
13                if(s.charAt(axis-orbit) == s.charAt(axis + orbit)){
14                    ans++;
15                }else{
16                    break;
17                }
18            }
19        }
20
21        for(double axis =0.5 ;axis<n ; axis++){
22            for(double orbit =0.5 ; axis-orbit >=0 && axis + orbit < n ; orbit++){
23                if(s.charAt((int)(axis-orbit)) == s.charAt((int)(axis + orbit))){
24                    ans++;
25                }else{
26                    break;
27                }
28            }
29        }
30
31        return ans;
32    }
33}