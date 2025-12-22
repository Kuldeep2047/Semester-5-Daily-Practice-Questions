// Last updated: 12/22/2025, 2:46:33 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        return answer(strs);
4    }
5
6    public int answer(String[] arr){
7        int n = arr.length;
8        int m = arr[0].length();
9
10        boolean[] isSorted =  new boolean[n-1]; // yaha track karenge ki i<i+1 sorted hai ya nhi
11
12        int delete =0 ; //-> kitne deletion ki need hai
13        for(int c =0 ;c <m ;c++){
14            boolean needDelete = false;
15
16            for(int r= 0 ;r<n-1 ;r++){
17
18                if(!isSorted[r]){
19
20                    char first = arr[r].charAt(c);
21                    char sec = arr[r+1].charAt(c);
22                    if(first > sec){
23                        needDelete = true;
24
25                        break;
26                    }
27                    // break;
28                }
29
30            }
31            if(needDelete){
32                delete++;
33                // continue;
34            }
35            else{
36                for(int r= 0 ;r<n-1 ;r++){
37                    if(!isSorted[r]){
38                        char first = arr[r].charAt(c);
39                        char sec = arr[r+1].charAt(c);
40                        if(first < sec){
41                            isSorted[r] = true;
42                        }
43                    }
44                }
45            }
46        }
47        // System.out.println(delete);
48        return delete;
49    }
50}