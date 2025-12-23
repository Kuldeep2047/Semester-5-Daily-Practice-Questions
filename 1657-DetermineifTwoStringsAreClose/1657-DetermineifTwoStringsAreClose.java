// Last updated: 12/23/2025, 9:18:47 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        return answer(word1,word2);
4    }
5    public static boolean answer(String s1,String s2){
6        int[] f1 = new int[26];
7        int[] f2 = new int[26];
8        for(int i=0;i<s1.length();i++){
9            f1[s1.charAt(i)-'a']++;
10        }
11        for(int i=0;i<s2.length();i++){
12            f2[s2.charAt(i)-'a']++;
13        }
14
15        for(int i=0;i<26;i++){
16            if((f1[i]==0 && f2[i]!=0) || (f1[i]!=0 && f2[i]==0)){
17                return false;
18            }
19        }
20        
21        Arrays.sort(f2);
22        Arrays.sort(f1);
23        for(int i=0;i<26;i++){
24            if(f1[i] != f2[i]){
25                return false;
26            }
27        }
28        return true;
29    }
30}