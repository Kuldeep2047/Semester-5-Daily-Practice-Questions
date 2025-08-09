// Last updated: 8/9/2025, 1:44:58 PM
class Solution {
    public int findMin(int[] nums) {
        return min_element(nums);
    }
    public static int min_element(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}