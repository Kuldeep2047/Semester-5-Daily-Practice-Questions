// Last updated: 8/9/2025, 1:39:39 PM
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        return Minimum_Element(nums,limit,goal);
    }
    public static int Minimum_Element(int[] nums,int limit,int goal){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum==goal){
            return 0;
        }
        long diff = Math.abs(goal-sum);
        int ans = (int)(diff/limit);
        if(diff%limit !=0){
            ans++;
        }
        return ans;

    }
}