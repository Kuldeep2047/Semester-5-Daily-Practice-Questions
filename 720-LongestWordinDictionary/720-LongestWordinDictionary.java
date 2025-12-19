// Last updated: 12/19/2025, 5:59:15 PM
1class Solution {
2    public String longestWord(String[] words) {
3        return answer(words);
4    }
5    public String answer(String[] arr){
6        int n = arr.length;
7        Arrays.sort(arr, (a,b)->{
8            if(a.length() != b.length()){
9                return b.length()-a.length();
10            }else{
11                return a.compareTo(b);
12            }
13        });
14
15        Set<String> set = new HashSet<>();
16        for(String s : arr){
17            set.add(s);
18        }
19
20        for(String word : arr){
21            boolean ans = true;
22            for(int i=1;i<word.length();i++){
23                if(! set.contains(word.substring(0,i))){
24                    ans = false;
25
26                    break;
27                }
28            }
29            if(ans== true){
30                return word;
31            }
32        }
33        return "";
34    }
35}