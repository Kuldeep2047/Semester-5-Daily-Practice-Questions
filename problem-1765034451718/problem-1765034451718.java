// Last updated: 12/6/2025, 8:50:51 PM
1class Solution {
2    public long maxPoints(int[] technique1, int[] technique2, int k) {
3        return answer(technique1, technique2, k);
4    }
5
6    public long answer(int[] arr1, int[] arr2, int k){
7        long sum =0;
8
9        int n = arr1.length;
10        for(int v : arr2){
11            sum += v;
12        }
13        int[] d = new int[n];
14
15        for(int i=0 ;i<n ;i++){
16            d[i] = arr1[i] - arr2[i];
17        }
18
19        Arrays.sort(d);
20        int m = n/2;
21
22        //ye reverse ker diya
23        for(int i=0 ;i< m ;i++){
24            int t = d[i];
25            d[i] = d[n-1-i];
26            d[n-i-1] = t;
27        }
28
29        for(int i=0 ;i<k && i<n ;i++){
30            sum += d[i];
31        }
32
33        for(int i=k ;i<n ;i++){
34            if(d[i] >0){
35                sum += d[i];
36            }
37        }
38
39        // System.out.println(sum);
40        return sum;
41        
42    }
43}
44
45
46
47
48
49
50
51
52
53