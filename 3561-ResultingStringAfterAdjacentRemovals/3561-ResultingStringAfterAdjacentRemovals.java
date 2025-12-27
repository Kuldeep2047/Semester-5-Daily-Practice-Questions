// Last updated: 12/27/2025, 8:39:27 PM
1class Solution {
2    public String resultingString(String s) {
3        return answer(s);
4    }
5    public static String answer(String s){
6        Stack<Character> st = new Stack<>();
7
8        for(int i=0 ;i<s.length() ;i++){
9
10            char c = s.charAt(i);
11            if(!st.isEmpty() && isConsecutive(st.peek(),c)){
12                st.pop();
13            }else{
14                st.push(c);
15            }
16        }
17
18        StringBuilder sb = new StringBuilder();
19        for(char c:st){
20            sb.append(c);
21        }
22        
23        
24        return sb.toString();
25    }
26    public static boolean isConsecutive(char c1,char c2){
27        int diff = Math.abs(c1-c2);
28        return diff==1 || (c1=='a' && c2=='z') || (c1=='z' && c2=='a');
29    }
30}