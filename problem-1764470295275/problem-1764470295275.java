// Last updated: 11/30/2025, 8:08:15 AM
1class Solution {
2    public int countElements(int[] nums, int k) {
3        return answer(nums, k);
4    }
5    public int answer(int[] arr ,int k){
6        Arrays.sort(arr);
7        int n = arr.length;
8
9        if(k == 0){
10            return n;
11        }
12
13        int ans =0;
14        int cut = arr[n-k];
15
16        for(int a : arr){
17            if(a<cut){
18                ans++;
19            }
20        }
21        return ans;
22    }
23}