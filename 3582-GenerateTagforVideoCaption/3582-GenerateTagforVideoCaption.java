// Last updated: 12/23/2025, 4:16:09 PM
1class Solution {
2    public String generateTag(String caption) {
3        if (caption == null || caption.trim().isEmpty()) {
4            return "#";
5        }
6
7        return answer(caption);
8    }
9    public String answer(String s){
10        String[] arr = s.trim().split("\\s+");
11        int n = arr.length;
12
13        StringBuilder sb = new StringBuilder();
14        sb.append("#");
15        arr[0] = arr[0].toLowerCase();
16
17        sb.append(arr[0]);
18        for(int i=1; i<n ;i++){
19            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
20
21            sb.append(arr[i]);
22        }
23
24        if(sb.length()>100){
25            return sb.substring(0,100).toString();
26        }
27        else{
28            return sb.toString();   
29        }
30
31
32    }
33
34    
35}