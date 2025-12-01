// Last updated: 12/1/2025, 1:49:58 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int ans = Integer.MIN_VALUE;
9
10        int sum = 0;
11        for(int i=0 ;i<n ;i++){
12            sum += arr[i];
13            ans = Math.max(ans, sum);
14            if(sum<0){
15                sum =0;
16            }
17        }
18        return ans;
19    }
20}