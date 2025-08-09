// Last updated: 8/9/2025, 1:38:01 PM
class Solution {
    public int maxScore(int[] nums) {
        return Rearrange_Element(nums);
    }
    
    public static int Rearrange_Element(int[] nums){
        Arrays.sort(nums);
        long sum=0;
        int ans=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            if(sum<=0){
                break;
            }else{
                ans++;
            }
        }
        return ans;
    }
}