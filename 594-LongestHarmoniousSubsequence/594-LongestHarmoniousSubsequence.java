// Last updated: 12/19/2025, 9:50:11 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        return answer(nums);
4    }
5    public int answer(int[] arr){
6        int n = arr.length;
7
8        // List<Integer> ll = new ArrayList<>();
9        HashMap<Integer, Integer> map = new HashMap<>();
10        for(int i=0 ;i<n ;i++){
11            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
12
13        }
14        int ans =0;
15        Arrays.sort(arr);
16
17        for(int i=1 ;i<n ;i++){
18            if(arr[i] - arr[i-1] == 1){
19                ans = Math.max(ans, map.get(arr[i])+ map.get(arr[i-1]));
20            }
21        }
22        return ans;
23    }
24}