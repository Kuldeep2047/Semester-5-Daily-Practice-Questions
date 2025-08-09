// Last updated: 8/9/2025, 1:38:29 PM
class Solution {
    public int minimumOperations(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] nums){
        // int n = nums.length;
        // int c=1;
        // Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(n!=0){
                set.add(n);
            }
        }
        return set.size();
    }
}