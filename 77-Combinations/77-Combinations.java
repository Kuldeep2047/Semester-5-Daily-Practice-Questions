// Last updated: 10/3/2025, 8:38:35 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        int start =1;
        combinators(ans, ll, n, k, start);
        return ans;
    }

    public static void combinators(List<List<Integer>> ans, List<Integer> ll, int n, int k, int start){
        if(k == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i = start ;i<=n ;i++){
            ll.add(i);
            combinators(ans, ll, n, k-1, i+1);

            ll.remove(ll.size()-1);
        }
    }
}