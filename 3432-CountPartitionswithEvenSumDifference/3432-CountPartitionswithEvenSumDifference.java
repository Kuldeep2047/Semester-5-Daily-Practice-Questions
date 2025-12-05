// Last updated: 12/5/2025, 11:51:21 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7        int left = 0;
8        int sum =0;
9        for(int v : arr){
10            sum += v;
11        }
12        int c =0;
13
14        for(int i=0 ;i<n-1 ;i++){
15            left += arr[i];
16            int right = sum - left;
17
18            if(Math.abs(left - right) % 2 == 0){
19                c++;
20            }
21        }
22        return c;
23    }
24}