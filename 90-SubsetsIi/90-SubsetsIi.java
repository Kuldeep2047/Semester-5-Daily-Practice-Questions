// Last updated: 8/9/2025, 1:45:30 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        print(nums, ans, 0, ll);
        return ans;
    }
    public static void print(int[] nums, List<List<Integer>> ans, int idx, List<Integer> ll) {
        if(idx==nums.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        print(nums, ans, idx+1, ll);
        ll.remove(ll.size()-1);
        
        int i = idx+1;
        while(i<nums.length && nums[i] == nums[i-1]) {
            i++;
        }
        print(nums, ans, i, ll);
         
    }
}