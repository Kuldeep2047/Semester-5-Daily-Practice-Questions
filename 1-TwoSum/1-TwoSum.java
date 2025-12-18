// Last updated: 12/18/2025, 10:41:06 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        return answer(nums, target);
4    }
5
6    public int[] answer(int[] arr ,int tar){
7        int n = arr.length;
8        int[] ans = {-1, -1};
9
10        for(int i=0 ;i<n ;i++){
11            for(int j=i+1 ;j<n ;j++){
12                if(arr[i]+arr[j] == tar){
13                    ans[0] = i;
14                    ans[1] = j;
15                    break;
16                }
17            }
18        }
19        return ans;
20    }
21}