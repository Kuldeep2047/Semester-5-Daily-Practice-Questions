// Last updated: 9/30/2025, 8:53:48 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        return consecutive_ones(nums,k);
    }

    public static int consecutive_ones(int[] nums,int k){
        int si=0, ei=0;
        int c =0;
        int ans=0;
        while(ei<nums.length){
            if(nums[ei]==0){
                c++;
            }
            while(c>k && si<=ei ){
                if(nums[si]==0){
                    c--;
                }
                si++;
            }

            ans = Math.max(ans,ei-si+1);
            ei++;


        }
        return ans;
    }

}