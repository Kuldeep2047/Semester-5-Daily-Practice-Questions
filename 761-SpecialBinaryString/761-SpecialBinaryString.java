// Last updated: 12/21/2025, 1:37:51 PM
1class Solution {
2    public String makeLargestSpecial(String s) {
3        return answer(s);
4    }
5
6    public String answer(String s){
7        int n = s.length();
8
9        int count = 0;
10        int start =0;
11        List<String> ll = new ArrayList<>();
12
13        for(int i=0 ;i<n ;i++){
14            if(s.charAt(i) == '1'){
15                count++;
16            }else{
17                count--;
18            }
19
20            if(count == 0){
21                String inner = s.substring(start+1, i);
22                String special = "1" + answer(inner) + "0";
23                ll.add(special);
24
25                start = i+1;
26            }
27        }
28
29        Collections.sort(ll);
30        Collections.reverse(ll);
31
32        StringBuilder sb = new StringBuilder();
33        for(String str : ll){
34            sb.append(str);
35        }
36
37        return sb.toString();
38    }
39}