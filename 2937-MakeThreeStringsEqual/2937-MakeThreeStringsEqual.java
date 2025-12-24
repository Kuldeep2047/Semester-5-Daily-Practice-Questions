// Last updated: 12/24/2025, 2:50:45 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        return answer(s1,s2,s3);
4    }
5    public int answer(String a, String b, String c){
6        if(a.charAt(0) != b.charAt(0) || b.charAt(0) != c.charAt(0)){
7            return -1;
8        }
9
10        int i=0;
11        while(i<a.length() && i<b.length() && i< c.length()){
12
13            if(a.charAt(i) == b.charAt(i) && b.charAt(i) == c.charAt(i)){
14                i++;
15            }else{
16                break;
17            }
18        }
19
20        return a.length() -i + b.length() -i + c.length() -i;
21    }
22}