// Last updated: 12/23/2025, 3:23:13 PM
1class Solution {
2    public String arrangeWords(String text) {
3        return answer(text);
4    }
5
6    public String answer(String s){
7        
8        String[] arr = s.split(" ");
9        int n = arr.length;
10
11        arr[0] = arr[0].substring(0,1).toLowerCase() + arr[0].substring(1);
12
13        //apply bubble sort for sortinf this length wisw
14        for(int turn =1 ;turn<n ;turn++){
15            for(int i=0 ;i<n - turn ;i++){
16                String a = arr[i];
17                String b = arr[i+1];
18                if(a.length() > b.length()){
19                    String temp = arr[i];
20                    arr[i] = arr[i+1];
21                    arr[i+1] = temp;
22                }
23            }
24        }
25        StringBuilder sb = new StringBuilder();
26
27        arr[0] = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1);
28        for(int i=0 ;i<n ;i++){
29            if(i == n-1){
30                sb.append(arr[i]);
31            }else{
32                sb.append(arr[i]+" ");
33            }
34        }
35        return sb.toString();
36
37    }
38}