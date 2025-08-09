// Last updated: 8/9/2025, 1:46:01 PM
class Solution {
    public boolean canJump(int[] nums) {
        return answer(nums);
    }
    public static boolean answer(int[] arr){
        int n = arr.length;
        int tar = n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]+i >= tar){
                tar = i;
            }
        }
        if(tar==0){
            return true;
        }else{
            return false;
        }
    }
}