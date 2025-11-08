// Last updated: 11/8/2025, 8:05:36 PM
class Solution {
    public int minMoves(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        int max = arr[n-1];

        int c =0;

        for(int a : arr){
            c += (max - a);
        }
        return c;
    }
}