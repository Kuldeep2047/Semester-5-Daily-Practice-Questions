// Last updated: 11/8/2025, 8:15:59 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        return answer(nums, target);
    }
    public static int answer(int[] arr , int tar){
        int n = arr.length;
        int ans =0;

        for(int i=0 ;i<n; i++){
            int curr =0;

            for(int j= i ;j<n ;j++){
                if(arr[j] == tar){
                    curr++;
                }

                if(curr *2> j-i+1){
                    ans++;
                }
            }
        }
        

        return ans;



        
    }
}