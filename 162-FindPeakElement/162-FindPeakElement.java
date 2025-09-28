// Last updated: 9/28/2025, 3:17:04 PM
class Solution {
    public int findPeakElement(int[] nums) {
        // return answer(nums);
        return peak_Element(nums);
    }
    public int peak_Element(int[] arr){
        if(arr.length ==1){
            return 0;
        }
        int low=0;
        int high = arr.length-1;
        while(low < high){
            int mid = (low + high)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }else{
                high = mid;

            }
        }
        return low;
    }

    // public int answer(int[] arr){
    //     int n = arr.length;
    //     for(int i=1; i< n-1;i++){
    //         if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}