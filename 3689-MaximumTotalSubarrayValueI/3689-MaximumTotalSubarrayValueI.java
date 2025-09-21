// Last updated: 9/21/2025, 8:46:28 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        return answer(nums,k);
    }
    public long answer(int[] arr,int k){
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int n : arr){
            if(n<min){
                min = n;
            }
            if(n>max){
                max = n;
            }
        }
        return k * (max- min);
    }
}