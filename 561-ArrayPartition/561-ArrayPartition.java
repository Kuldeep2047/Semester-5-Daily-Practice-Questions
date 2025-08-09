// Last updated: 8/9/2025, 1:42:55 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int n = arr.length;
        int sum =0;
        Arrays.sort(arr);
        for(int i=0;i<n;i+=2){
            sum += arr[i];
        }
        return sum;
    }
}