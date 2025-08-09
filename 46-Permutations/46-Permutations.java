// Last updated: 8/9/2025, 1:46:14 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ques = new ArrayList<>();
        for(int n:nums){
            ques.add(n);
        }
        permutation(ques,new ArrayList<>(),ans);
        return ans;
        
    }
    public static void permutation(List<Integer> ques,List<Integer> ll,List<List<Integer>> ans ){
        if(ques.size()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<ques.size();i++){
            int val = ques.get(i);
            ll.add(val);
            List<Integer> next = new ArrayList<>(ques);
            next.remove(i);
            permutation(next,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}