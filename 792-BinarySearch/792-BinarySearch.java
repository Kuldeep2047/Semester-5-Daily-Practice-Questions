// Last updated: 8/9/2025, 1:42:18 PM
class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums,target);
    }
    public static int binary_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}