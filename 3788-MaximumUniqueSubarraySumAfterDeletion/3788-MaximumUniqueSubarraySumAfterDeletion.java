// Last updated: 8/9/2025, 1:36:41 PM
class Solution {
    public int maxSum(int[] nums) {
        return Max_Sum(nums);
    }
    public static int Max_Sum(int[] nums){
        // List<Integer> ll = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        if(set.isEmpty()){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int sum=0;
        for(int n : set){
            sum+=n;
        }
        return sum;
            
            
    }
}