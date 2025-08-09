// Last updated: 8/9/2025, 1:41:38 PM
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        return Even_Sum(nums,queries);
    }
    public static int[] Even_Sum(int[] nums,int[][] queries){
        int n = queries.length;
        int[] ans = new int[n];
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even+=nums[i];
            }
        }
        for(int row=0;row<n;row++){
            int idx = queries[row][1];
            int val = queries[row][0];
            if(nums[idx]%2==0){
                even -= nums[idx];
            }

            nums[idx] = nums[idx]+val;
            if(nums[idx]%2==0){
                even += nums[idx];
            }
            ans[row] = even;
        }
        return ans;
    }
}