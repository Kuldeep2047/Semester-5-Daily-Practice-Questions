// Last updated: 12/20/2025, 5:32:07 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        return answer(name, typed);
4    }
5
6    public boolean answer(String name, String type){
7        int n = type.length();
8        int m = name.length();
9        int j=0;
10        int i=0;
11
12        while(i<m && j<n){
13            if(name.charAt(i) == type.charAt(j)){
14                i++;
15                j++;
16            }
17            else if(j>0 && type.charAt(j) == type.charAt(j-1)){
18                j++;
19            }else{
20                return false;
21            }
22        }
23
24        while(j< n){
25            if(name.charAt(m-1) != type.charAt(j)){
26                return false;
27            }
28            j++;
29        }
30        return i == m;
31
32    }
33}