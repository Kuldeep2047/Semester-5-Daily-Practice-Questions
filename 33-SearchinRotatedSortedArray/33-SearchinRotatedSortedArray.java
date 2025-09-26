// Last updated: 9/26/2025, 11:06:17 PM
class Solution {
    public int search(int[] nums, int target) {
        return answer(nums,target);
    }
    public int answer(int[] arr ,int target){
        int n = arr.length;
        int low =0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]== target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && arr[mid]>target){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<target && arr[high]>=target){
                    low = mid+1;
                }else{
                    high = mid -1;
                }

            }
        }
        return -1;

    }
}