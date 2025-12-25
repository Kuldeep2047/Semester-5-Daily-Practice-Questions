// Last updated: 12/25/2025, 10:16:03 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int[] dp = new int[n];
8        Arrays.fill(dp ,1);
9        int max =1;
10
11        for(int i=1 ;i<n ;i++){
12            for(int j=i-1 ;j>=0 ;j--){
13                if(arr[i] > arr[j]){
14                    dp[i] = Math.max(dp[i], dp[j]+1);
15
16                    max = Math.max(max, dp[i]);
17                }
18            }
19        }
20        return max;
21
22    }
23}