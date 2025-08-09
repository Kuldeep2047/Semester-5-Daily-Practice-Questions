// Last updated: 8/9/2025, 1:45:44 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        combination(n,k,1,ans,ll);
        return ans;
        
    }
    public static void combination(int n,int k,int idx,List<List<Integer>> ans,List<Integer> ll){
        if(k==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<=n;i++){
            ll.add(i);
            combination(n,k-1,i+1,ans,ll);
            ll.remove(ll.size()-1);
        }
    }
}