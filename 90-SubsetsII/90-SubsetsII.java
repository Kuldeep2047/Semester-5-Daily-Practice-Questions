// Last updated: 10/4/2025, 11:52:10 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);
        Sub_Sets(nums, 0, ll, ans);
        return ans;
    }

    public static void Sub_Sets(int[] nums, int idx, List<Integer> ll, List<List<Integer>> ans){
        
            ans.add(new ArrayList<>(ll));
       

        for(int i = idx ;i<nums.length ;i++){
            if(i>idx && nums[i] == nums[i-1]){
                continue;
            }
            ll.add(nums[i]);
            Sub_Sets(nums ,i+1, ll ,ans);
            ll.remove(ll.size()-1);
        }
    }
}