// Last updated: 12/21/2025, 12:51:00 PM
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3        return answer(a,b);
4    }
5
6    public int answer(String a, String b){
7
8        int ans = 1;
9        String temp = a;
10
11        while(a.length() < b.length()){
12            a += temp;
13            ans++;
14        }
15
16        if(a.contains(b)){
17            return ans;
18        }
19        
20        a += temp;
21        ans++;
22        if(a.contains(b)){
23            return ans;
24        }else{
25            return -1;
26        }
27
28        
29    }
30}