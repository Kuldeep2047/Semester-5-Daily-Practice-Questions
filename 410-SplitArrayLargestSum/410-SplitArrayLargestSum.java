// Last updated: 8/9/2025, 1:43:25 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        return Split_Array_Sum(nums,k);
    }
    public static int Split_Array_Sum(int[] nums,int k) {
		int start=0;
		int end=0;
		for(int i=0;i<nums.length;i++) {
			start = Math.max(start, nums[i]);
			end += nums[i];
		}
		int ans = end;
		while(start<=end) {
			int mid = (start+end)/2;
			if(ispossible(nums,k,mid)) {
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return ans;
		
	}
	
	public static boolean ispossible(int[] nums,int k ,int mid) {
		int split =1;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum +=nums[i];
			if(sum>mid) {
				split++;
				sum = nums[i];
				if(split>k) {
					return false;
				}
			}
		}
		return true;
		
	}
}