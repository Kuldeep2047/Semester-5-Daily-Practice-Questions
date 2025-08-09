// Last updated: 8/9/2025, 1:40:43 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        return Target_Array(nums,index);
    }
    public static int[] Target_Array(int[] nums,int[] index){
        List<Integer> ll = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ll.add(index[i],nums[i]);
        }

        for(int i=0;i<ll.size();i++){
            ans[i] = ll.get(i);
        }
        return ans;
    }
}