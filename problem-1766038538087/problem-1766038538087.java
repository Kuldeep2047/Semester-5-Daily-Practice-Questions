// Last updated: 12/18/2025, 11:45:38 AM
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
23        int c =0;
24        for(int i=0 ;i<s.length() ;i++){
25            char ch = s.charAt(i);
26            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
27                c++;
28            }
29        }
30        return c;
31    }
32    public String reverse(String s){
33        StringBuilder sb  = new StringBuilder();
34        for(int i = s.length()-1 ;i>=0 ;i--){
35            sb.append(s.charAt(i));
36        }
37
38        return sb.toString();
39    }
40}