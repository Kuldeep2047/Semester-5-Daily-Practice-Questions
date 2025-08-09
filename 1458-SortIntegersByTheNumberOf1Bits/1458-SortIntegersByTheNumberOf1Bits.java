// Last updated: 8/9/2025, 1:40:53 PM
class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[][] nums = new int[arr.length][2];
        for(int i=0;i<nums.length;i++){
            nums[i][0] = arr[i];
            nums[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(nums,Comparator.comparingInt(a->a[1]));
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i][0];
        }
        return arr;
    }
}