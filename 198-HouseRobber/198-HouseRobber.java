// Last updated: 1/3/2026, 12:53:21 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp ,-1);
5        // return answer(nums);
6        return Max_Rob(nums, 0 , dp);
7    }
8
9    public static int Max_Rob(int[] arr, int idx, int[] dp){
10        if(idx >= arr.length){
11            return 0;
12        }
13
14        if(dp[idx] != -1){
15            return dp[idx];
16        }
17
18        int not_rob = Max_Rob(arr, idx +1, dp);
19        int rob = arr[idx] + Max_Rob(arr, idx +2, dp);
20        return dp[idx] = Math.max(not_rob, rob);
21    }
22
23    // public int answer(int[] arr){
24    //     int prev2 =0;
25    //     int prev =arr[0];
26    //     for(int i=1;i<arr.length ;i++){
27    //         int pick = arr[i] + prev2;
28    //         int not_pick = prev;
29    //         int curr = Math.max(pick, not_pick);
30
31    //         prev2 = prev;
32    //         prev = curr;
33    //     }
34    //     return prev;
35    // }
36}