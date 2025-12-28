// Last updated: 12/28/2025, 12:18:53 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        return answer(nums ,k);
4    }
5
6    public int answer(int[] arr ,int k){
7        int n = arr.length;
8
9        int ans = Integer.MAX_VALUE;
10        for(int i=0 ;i<n ;i++){
11            for(int j=i ;j<n ;j++){
12                if(isAnswer(arr, i, j, k)){
13                    ans = Math.min(ans, (j-i+1));
14                }
15            }
16        }
17
18        if(ans == Integer.MAX_VALUE){
19            return -1;
20        }
21        return ans;
22    }
23
24    public boolean isAnswer(int[] arr, int si ,int ei, int k){
25        int or =0;
26        while(si<=ei){
27            or |= arr[si];
28            si++;
29        }
30        if(or >=k){
31            return true;
32        }
33        return false;
34    }
35}