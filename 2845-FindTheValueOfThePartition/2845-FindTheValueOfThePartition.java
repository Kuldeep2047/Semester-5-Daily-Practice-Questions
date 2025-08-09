// Last updated: 8/9/2025, 1:37:46 PM
class Solution {
    public int findValueOfPartition(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int ans =Integer.MAX_VALUE;;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            int d = arr[i] - arr[i-1];
            ans = Math.min(ans,d);
        }
        return ans;
    }
}