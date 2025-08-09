// Last updated: 8/9/2025, 1:39:01 PM
class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int min = nums[i];
            int max = nums[i];
            for(int j=i;j<nums.length;j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += (max-min);
            }
        }
        return sum;
    }
    // public static long max_min_sum(int[] arr){
    //     Arrays.sort(arr);
    //     int min = arr[0];
    //     int max = arr[arr.length-1];
    //     return max-min;

    // }
}