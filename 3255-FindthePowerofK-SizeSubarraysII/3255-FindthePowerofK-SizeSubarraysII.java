// Last updated: 12/28/2025, 9:46:42 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        return answer(nums, k);
4    }
5
6    public int[] answer(int[] arr ,int k){
7        int n = arr.length;
8
9        int[] ans = new int[n-k+1];
10        int c =0;
11
12        for(int i=1 ;i<k ;i++){
13            if(arr[i] == arr[i-1]+1){
14                c++;
15            }
16        }
17        if(c == k-1){
18            ans[0] = arr[k-1];
19        }else{
20            ans[0] = -1;
21        }
22        for(int i=k ;i<n ;i++){
23            if(arr[i-k+1] == arr[i-k]+ 1){
24                c--;
25            }
26            if(arr[i] == arr[i-1] + 1){
27                c++;
28            }
29
30            ans[i-k+1] = (c == k-1) ? arr[i] : -1;
31        }
32
33        return ans;
34    }
35}