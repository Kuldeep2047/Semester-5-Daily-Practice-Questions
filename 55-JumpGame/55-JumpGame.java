// Last updated: 10/1/2025, 2:16:17 PM
class Solution {
    public boolean canJump(int[] nums) {
        return answer(nums);
    }
    public static boolean answer(int[] arr){
        int n = arr.length;
        // int tar = n-1;
        // for(int i=n-1;i>=0;i--){
        //     if(arr[i]+i >= tar){
        //         tar = i;
        //     }
        // }
        // if(tar==0){
        //     return true;
        // }else{
        //     return false;
        // }

        int maxReach = 0;
        for(int i=0; i<n ;i++){
            if(i>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, arr[i] + i);
        }

        return true;
    }
}