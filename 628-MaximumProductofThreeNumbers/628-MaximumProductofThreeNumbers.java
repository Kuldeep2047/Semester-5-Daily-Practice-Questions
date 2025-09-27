// Last updated: 9/27/2025, 1:23:29 PM
class Solution {
    public int maximumProduct(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int a = arr[0]*arr[1]*arr[n-1];
        int b = arr[n-1] * arr[n-2] * arr[n-3];
        return Math.max(a,b);
    }
}