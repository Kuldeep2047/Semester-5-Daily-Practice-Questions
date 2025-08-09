// Last updated: 8/9/2025, 1:45:47 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return(find_element(matrix,target));
    }
    public static boolean find_element(int[][] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(binary_search(arr[i],item)){
                return true;
            }
        }
        return false;

    }
    public static boolean binary_search(int[] arr,int target){
        int n = arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return false;
    }
}