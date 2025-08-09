// Last updated: 8/9/2025, 1:41:00 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        return smallest_divisior(nums,threshold);
    }

    public static int smallest_divisior(int[] nums,int threshold){
        int start=1;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>end){
                end =nums[i];
            }
        }
        int ans=end;
        while(start<=end){
            int mid = (start+end)/2;  
            if(ispossible(nums,threshold,mid)){
                end = mid-1;
                ans =mid;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static boolean ispossible(int[] nums,int threshold,int mid){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (int)Math.ceil((float)nums[i]/mid);
            if(sum>threshold){
                return false;
            }
        }
        return true;
    }
}