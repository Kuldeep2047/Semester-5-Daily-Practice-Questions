// Last updated: 10/4/2025, 10:56:31 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        Sub_Sets(nums, 0, ll, ans);
        return ans;
    }
    public static void Sub_Sets(int[] nums , int idx, List<Integer> ll, List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(ll));  // in last add in ans list
        

        for(int i = idx ;i<nums.length ;i++){
            ll.add(nums[i]);
            Sub_Sets(nums, i+1, ll, ans);
            ll.remove(ll.size()-1);
        }



    }

    // public static void Sub_Sets(int[] nums , int idx, List<Integer> ll, List<List<Integer>> ans){
    //     if(idx == nums.length){
    //         ans.add(new ArrayList<>(ll));
    //         return;
    //     }

    //     ll.add(nums[idx]);
    //     Sub_Sets(nums, idx+1, ll, ans);
    //     ll.remove(ll.size()-1);
    //     Sub_Sets(nums, idx+1, ll, ans);



    // }
}