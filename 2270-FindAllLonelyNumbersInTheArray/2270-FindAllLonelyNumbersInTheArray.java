// Last updated: 8/9/2025, 1:38:54 PM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        return lonely_numbers(nums);
    }
    public static List<Integer> lonely_numbers(int[] nums){
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            // if(ll.contains(nums[i])==false && ll.contains(nums[i]-1)==false && ll.contains(nums[i]+1)==false){
            //     ll.add(nums[i]);
            // }
            if ((i == 0 || nums[i] - nums[i - 1] > 1) && (i == nums.length - 1 || nums[i + 1] - nums[i] > 1)){
                ll.add(nums[i]);
            } 
            
        }
        return ll;
    }
}