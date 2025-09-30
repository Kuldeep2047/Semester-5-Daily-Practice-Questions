// Last updated: 9/30/2025, 8:54:39 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        return Consecutive_Ones_III(nums ,k);
    }

    public static int Consecutive_Ones_III(int[] arr ,int k){
        int n = arr.length;
        int si =0;
        int ei =0;
        int ans =0;
        int c=0;

        while(ei<n){
            if(arr[ei]==0){
                c++;
            }
            while(c>k && si<=ei){
                if(arr[si] == 0){
                    c--;
                    
                }
                si++;
            }

            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}