// Last updated: 9/26/2025, 8:37:00 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0]= first_search(nums,target);
        arr[1]= last_search(nums,target);
        return arr;
    }
    public static int first_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        int first=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return first;
    }
    public static int last_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        int sec=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                sec=mid;
                start=mid+1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return sec;
    }
}