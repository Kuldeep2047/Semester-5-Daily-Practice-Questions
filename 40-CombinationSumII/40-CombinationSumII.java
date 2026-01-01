// Last updated: 1/1/2026, 12:09:08 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> ll = new ArrayList<>();
5        Arrays.sort(candidates);
6
7        answer(candidates, ans, ll, target, 0);
8
9        return ans;
10    }
11
12    public void answer(int[] candidates, List<List<Integer>> ans, List<Integer> ll, int target, int idx){
13        if(target == 0){
14            ans.add(new ArrayList<>(ll));
15            return;
16        }
17
18        for(int i=idx ; i<candidates.length ;i++){
19            if(i> idx && candidates[i] == candidates[i-1]){
20                continue;
21            }
22            if(candidates[i] <= target){
23                ll.add(candidates[i]);
24                answer(candidates, ans, ll, target - candidates[i], i+1);
25                ll.remove(ll.size()-1);
26            }
27        }
28    }
29}