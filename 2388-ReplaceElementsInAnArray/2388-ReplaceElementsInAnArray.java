// Last updated: 8/9/2025, 1:38:36 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        return Replace_Elements(nums,operations);
    }
    public static int[] Replace_Elements(int[] nums,int[][] operations){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int row=0;row<operations.length;row++){
            int old = operations[row][0];
            int newv = operations[row][1];
            int idx = map.get(old);
            nums[idx] = newv;
            map.remove(old);
            map.put(newv,idx);
        }
        return nums;
    }
}