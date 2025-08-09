// Last updated: 8/9/2025, 1:42:05 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return peak_index(arr);
    }
    public static int peak_index(int[] arr){
        int start=0;
        int end = arr.length-1;
       
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]<arr[mid+1]){
                
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}