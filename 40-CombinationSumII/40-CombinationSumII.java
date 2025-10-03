// Last updated: 10/3/2025, 9:01:48 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        Arrays.sort(candidates);
        int start =0;
        Combination(ans, ll, candidates, target, start);
        return ans;
    }

    public static void Combination(List<List<Integer>> ans, List<Integer> ll, int[] candidates, int amount, int start){
        if(amount == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i= start ;i<candidates.length ;i++){
            if(i > start && candidates[i] == candidates[i - 1]) continue;

            if(amount>= candidates[i]){
                ll.add(candidates[i]);
                Combination(ans, ll, candidates, amount - candidates[i], i+1);

                ll.remove(ll.size()-1);
            }
        }
    }
}