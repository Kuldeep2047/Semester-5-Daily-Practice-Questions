// Last updated: 12/18/2025, 10:50:51 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        return answer(strs);
4    }
5
6    public String answer(String[] strs){
7        if(strs.length == 0){
8            return "";
9        }
10
11        for(int i = 0; i <strs[0].length(); i++){
12            char c = strs[0].charAt(i);
13
14            for(int j = 1; j < strs.length; j++){
15                if(i== strs[j].length() || strs[j].charAt(i) != c){
16                    return strs[0].substring(0, i);
17                }
18            }
19        }
20        return strs[0];
21    }
22}