// Last updated: 8/9/2025, 1:45:38 PM
class Solution {
    public boolean search(int[] nums, int target) {
        return find_element(nums,target);
    }
    public static boolean find_element(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}