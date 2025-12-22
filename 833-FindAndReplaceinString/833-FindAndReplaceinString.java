// Last updated: 12/22/2025, 4:30:04 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        return answer(s, indices, sources, targets);
4    }
5
6    public String answer(String s, int[] idx, String[] src, String[] tar){
7        int n = s.length();
8
9        Map<Integer,Integer> map = new HashMap<>();
10
11        for(int i=0 ;i<idx.length; i++){
12            if(s.startsWith(src[i], idx[i])){
13                map.put(idx[i], i);
14            }
15        }
16        // String s = "";
17        StringBuilder sb = new StringBuilder();
18
19        for(int i=0 ;i<n ;){
20            if(!map.containsKey(i)){
21                char ch = s.charAt(i);
22                sb.append(ch);
23                i++;
24            }
25            else{
26                int k = map.get(i);
27                sb.append(tar[k]);
28
29                i += src[k].length();
30            }
31        }
32
33        return sb.toString();
34
35    }
36}