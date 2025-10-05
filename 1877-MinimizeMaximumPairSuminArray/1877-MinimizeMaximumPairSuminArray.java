// Last updated: 10/5/2025, 5:10:37 PM
class Solution {
    public int minPairSum(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        int n = arr.length;

        
        for(int i = 0; i< n/2 ;i++){
            int sum = arr[i] + arr[n-i-1];

            ans = Math.max(ans, sum);
        }
        return ans;
    }
}