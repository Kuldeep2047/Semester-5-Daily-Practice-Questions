// Last updated: 12/18/2025, 10:25:49 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        return answer(nums, target);
4    }
5
6    public int[] answer(int[] arr ,int tar){
7        int n = arr.length;
8        int[] ans = {-1,-1};
9
10        for(int i=0 ;i<n ;i++){
11            if(arr[i] == tar){
12                ans[0] = i;
13                break;
14            }
15        }
16
17        for(int i=n-1 ;i>=0 ;i--){
18            if(arr[i] == tar){
19                ans[1] = i;
20                break;
21            }
22        }
23        return ans;
24    }
25}