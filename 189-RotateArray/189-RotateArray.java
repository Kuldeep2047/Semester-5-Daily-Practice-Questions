// Last updated: 8/9/2025, 1:44:42 PM
class Solution {
    public void rotate(int[] nums, int k) {
        answer(nums,k);
    }
    public static int[] answer(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        swap(arr,0,n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
        return arr;
    }
    public static void swap(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}