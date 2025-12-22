// Last updated: 12/22/2025, 3:27:27 PM
1class Solution {
2    public String longestNiceSubstring(String s) {
3        return answer(s);
4    }
5    public String answer(String s){
6        int n = s.length();
7        if(n < 2){
8            return "";
9        }
10        // HashSet<Character, Integer> map = new HashSet<>();
11        
12        Set<Character> set = new HashSet<>();
13        for(int i=0 ;i<n ;i++){
14            set.add(s.charAt(i));
15        }
16
17        for(int i=0 ;i<n ;i++){
18            char ch = s.charAt(i);
19            
20            //check ki char ch ke both uppercase and lowercase character exist kerte hai ya nhi
21            boolean isLower = set.contains(Character.toLowerCase(ch));
22            boolean isUpper = set.contains(Character.toUpperCase(ch));
23
24            if(isLower && isUpper){
25                continue;
26            }else{
27                String left = answer(s.substring(0,i));
28                String right = answer(s.substring(i+1));
29                
30                //return longest nice wali substring
31                if(left.length() >= right.length()){
32                    return left;
33                }else{
34                    return right;
35                }
36            }
37
38        }
39        return s;
40
41    }
42}