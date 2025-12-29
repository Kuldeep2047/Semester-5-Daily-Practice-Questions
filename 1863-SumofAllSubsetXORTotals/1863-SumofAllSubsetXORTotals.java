// Last updated: 12/29/2025, 9:04:45 PM
1class Solution {
2    int xor =0;
3    public int subsetXORSum(int[] nums) {
4        List<Integer> ll = new ArrayList<>();
5
6        answer(nums, 0, ll);
7        return xor;
8
9    }
10
11    public void answer(int[] arr ,int idx, List<Integer> ll){
12        if(idx == arr.length){
13            int curr_xor = 0;
14            for(int a : ll){
15                curr_xor ^= a;
16            }
17            xor += curr_xor;
18
19            return ;
20        }
21
22        int curr = arr[idx];
23
24        ll.add(curr);
25        answer(arr, idx+1, ll);
26        ll.remove(ll.size()-1);
27        answer(arr, idx+1, ll);
28    }
29}