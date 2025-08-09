// Last updated: 8/9/2025, 1:44:22 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return Majority(nums);
    }
    public static List<Integer> Majority(int[] nums){
        List<Integer> ll = new ArrayList<>();
        int max = (nums.length/3)+1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == max){
                ll.add(nums[i]);
            }
        }
        return ll;
    }
}