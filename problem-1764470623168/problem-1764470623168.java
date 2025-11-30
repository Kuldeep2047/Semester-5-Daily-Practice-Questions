// Last updated: 11/30/2025, 8:13:43 AM
1class Solution {
2    public int maxDistinct(String s) {
3        return answer(s);
4    }
5
6    public int answer(String s){
7        int n = s.length();
8        Set<Character> set = new HashSet<>();
9
10        for(int i=0 ;i<n ;i++){
11            char ch = s.charAt(i);
12            if(!set.contains(ch)){
13                set.add(ch);
14            }
15        }
16        return set.size();
17        
18    }
19}