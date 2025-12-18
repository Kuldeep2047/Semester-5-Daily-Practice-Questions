// Last updated: 12/18/2025, 11:24:21 AM
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        return answer(nums, k);
4    }
5    public int answer(int[] arr, int k){
6        int large =0;
7        int small =0;
8        int n = arr.length;
9        Arrays.sort(arr);
10        for(int i=0 ;i<k ;i++){
11            small += arr[i];
12            large += arr[n-1-i];
13        }
14
15        return Math.abs(large - small);
16    }
17}