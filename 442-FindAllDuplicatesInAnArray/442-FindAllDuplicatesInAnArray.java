// Last updated: 8/9/2025, 1:43:18 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int abs = Math.abs(nums[i]);
            int idx = abs-1;
            if(nums[idx]<0){
                ans.add(abs);
            }
            nums[idx] = nums[idx]* -1;
        }
        return ans;
    }
}