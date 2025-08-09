// Last updated: 8/9/2025, 1:43:52 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return top_k(nums,k);
    }
    public static int[] top_k(int[] nums,int k){
        int max = nums[0];
        int min = nums[0];
        int[] ans = new int[k];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }
        int range = max-min+1;
        int[][] arr = new int[range][2];
        int j=0;
        for(int n:nums){
            int idx = n-min;
            arr[idx][0] = n;
            arr[idx][1]++;
        }
        // int c=0;
        Arrays.sort(arr, (a,b)-> Integer.compare(b[1],a[1]));
        for(int i=0;i<k;i++){
            ans[i] = arr[i][0];
        }
        return ans;
    }
}