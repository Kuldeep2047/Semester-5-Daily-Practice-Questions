// Last updated: 8/9/2025, 1:39:51 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int sum =0;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        int sum2 =0;
        int ans2 =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum2 += arr[i];
            ans2 = Math.min(ans2,sum2);
            if(sum2>0){
                sum2=0;
            }
        }
        return Math.max(ans,Math.abs(ans2));
    }
}