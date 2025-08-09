// Last updated: 8/9/2025, 1:45:42 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subset(nums,0,ans,ll);
        return ans;
        
    }
    public static void Subset(int[] nums,int idx,List<List<Integer>> ans,List<Integer> ll){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        Subset(nums,idx+1,ans,ll);
        ll.remove(ll.size()-1);
        Subset(nums,idx+1,ans,ll);
    }
}