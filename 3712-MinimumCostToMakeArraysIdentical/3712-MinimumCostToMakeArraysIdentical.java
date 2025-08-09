// Last updated: 8/9/2025, 1:36:59 PM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        return Minimum_Cost(arr,brr,k);
    }
    public static long Minimum_Cost(int[] arr,int[] brr,long k){
        long ans2=0;
        for(int i=0;i<arr.length;i++){
            ans2+=Math.abs(arr[i]-brr[i]);
        }
        
        Arrays.sort(brr);
        Arrays.sort(arr);
        long ans1 =0;
        for(int i=0;i<arr.length;i++){
            ans1 += Math.abs(arr[i]-brr[i]);
        }
        
        return Math.min(ans2, ans1 + k);
    }

}