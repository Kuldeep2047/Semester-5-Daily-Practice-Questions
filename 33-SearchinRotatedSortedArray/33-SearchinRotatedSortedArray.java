// Last updated: 9/27/2025, 1:36:13 PM
class Solution {
    public int search(int[] nums, int target) {
        return answer(nums, target);
    }
    public int answer(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }
        }
        return -1;
    }
}