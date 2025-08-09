// Last updated: 8/9/2025, 1:38:18 PM
class Solution {
    public int[] findArray(int[] pref) {
        return answer(pref);
    }
    public static int[] answer(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = arr[i]^arr[i-1];
        }
        return ans;
    }
}