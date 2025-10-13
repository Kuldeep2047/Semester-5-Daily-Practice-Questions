// Last updated: 10/13/2025, 7:27:05 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];

        for(int[] r : dp){
            Arrays.fill(r, -1);
        }
        int score_diff = Score(nums, 0, nums.length-1,dp);
        return score_diff >=0;
    }

    public int Score(int[] nums, int l, int r, int[][] dp){
        if(l == r){
            return nums[l];
        }
        if(dp[l][r] != -1){
            return dp[l][r];
        }

        int left = nums[l] - Score(nums, l+1, r, dp);
        int right = nums[r] - Score(nums, l, r-1, dp);

        return dp[l][r] = Math.max(left, right);
    }
}