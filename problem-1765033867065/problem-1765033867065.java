// Last updated: 12/6/2025, 8:41:07 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        return answer(nums);
4    }
5    public int[] answer(int[] arr){
6        int n = arr.length;
7        int[] ans = new int[n];
8        List<Integer> ll = makePal(10000);
9
10        for(int i=0 ;i<n ;i++){
11            ans[i] = minStep(arr[i], ll);
12        }
13        return ans;
14
15        
16    }
17    
18    public List<Integer> makePal(int n){
19        List<Integer> ll = new ArrayList<>();
20        for(int i=1 ;i<=n ;i++){
21            if(isPal(i)){
22                ll.add(i);
23            }
24        }
25        return ll;
26    }
27
28    public int minStep(int val, List<Integer> ll){
29        int idx = Collections.binarySearch(ll, val);
30        int n = ll.size();
31        if(idx <0){
32            idx = -idx -1;
33        }
34        int opr = Integer.MAX_VALUE;
35
36        if(idx < n){
37            int v = Math.abs(ll.get(idx)- val);
38            opr = Math.min(opr, v);
39        }
40        if(idx -1 >=0){
41            opr = Math.min(opr, Math.abs(ll.get(idx-1)- val));
42        }
43        return opr;
44    }
45
46    
47    
48    // public int[] answer(int[] arr){
49    //     int n = arr.length;
50    //     int[] ans = new int[n];
51
52    //     for(int i=0 ;i<n ;i++){
53    //         int opr = Integer.MAX_VALUE;
54            
55    //         int val = arr[i];
56    //         for(int j=0 ;j<=500 ;j++){
57    //             // int v2 = val +j;
58    //             if(isPal(val + j)){
59    //                 opr = Math.min(opr, j);
60    //             }
61    //             if(val - j >=0 && isPal(val- j)){
62    //                 opr = Math.min(opr, j);
63    //             }
64    //         }
65    //         ans[i] = opr;
66    //     }
67
68    //     return ans;
69        
70    // }
71
72    public boolean isPal(int num){
73        if(num == 0){
74            return true;
75        }
76
77        String s = Integer.toBinaryString(num);
78        int i=0;
79        int j = s.length()-1;
80        while(i<=j){
81            if(s.charAt(i) != s.charAt(j)){
82                return false;
83            }
84            i++;
85            j--;
86        }
87        return true;
88    }
89
90    
91}