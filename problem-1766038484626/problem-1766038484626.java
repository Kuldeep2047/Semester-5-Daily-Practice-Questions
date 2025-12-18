// Last updated: 12/18/2025, 11:44:44 AM
1class Solution {
2    public String reverseWords(String s) {
3        return answer(s);
4    }
5    public String answer(String s){
6        String[] arr = s.split(" ");
7        int n = arr.length;
8        
9        int firstVowelCount = countVowel(arr[0]);
10        
11        for (int i = 1; i < n; i++) {
12            if (countVowel(arr[i]) == firstVowelCount) {
13                arr[i] = reverse(arr[i]);
14            }
15        }
16        
17       
18        return String.join(" ", arr);
19    }
20
21
22    public int countVowel(String s){
23        int c = 0;
24        for (char ch : s.toCharArray()) {
25            ch = Character.toLowerCase(ch);
26            if ("aeiou".indexOf(ch) != -1) c++;
27        }
28        return c;
29    }
30    public String reverse(String s){
31        StringBuilder sb  = new StringBuilder();
32        for(int i = s.length()-1 ;i>=0 ;i--){
33            sb.append(s.charAt(i));
34        }
35
36        return sb.toString();
37    }
38}