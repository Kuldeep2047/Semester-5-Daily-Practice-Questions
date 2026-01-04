// Last updated: 1/4/2026, 12:24:09 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        return answer(nums);
4    }
5
6    public int answer(int[] arr){
7        int n = arr.length;
8        int[] dp = new int[n];
9        int ans =1;
10
11        Arrays.fill(dp , 1);
12
13        for(int i=0 ;i<n ;i++){
14            for(int j = i-1 ;j>=0 ;j--){
15                if(arr[i]>arr[j]){
16                    dp[i] = Math.max(dp[i], dp[j] +1);
17                    ans = Math.max(ans, dp[i]);
18                }                
19            }
20        }
21
22        return ans;
23    }
24}