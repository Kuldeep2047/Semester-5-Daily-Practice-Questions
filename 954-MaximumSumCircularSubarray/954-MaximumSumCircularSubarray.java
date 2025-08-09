// Last updated: 8/9/2025, 1:41:52 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return Max_Sum(nums);
    }
    public static int Max_Sum(int[] arr) {
		int linear_max = Kadans(arr);
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i] = -1*arr[i];
		}
		int mid_max = Kadans(arr);
		int circular_sum = sum + mid_max;
        if(circular_sum==0){
            return linear_max;
        }
		return Math.max(linear_max, circular_sum);
		
		
	}
	
	public static int Kadans(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}