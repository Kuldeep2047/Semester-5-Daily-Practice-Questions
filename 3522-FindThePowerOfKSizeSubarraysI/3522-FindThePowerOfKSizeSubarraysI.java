// Last updated: 8/9/2025, 1:37:09 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        int i=0;
        int c=0;
        while(i<=nums.length-k){
            arr[c]=isPower(nums,i,i+k-1);
            c++;
            i++;

        }
        return arr;

        
    }
    public static int isPower(int[] nums,int i,int j){
        for (int k = i; k < j; k++) {
            if (nums[k + 1] - nums[k] != 1) {
                return -1;
            }
        }
        return nums[j];
    }
}