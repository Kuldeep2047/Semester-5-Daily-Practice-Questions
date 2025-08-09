// Last updated: 8/9/2025, 1:42:30 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return Product_Less_Than_K(nums,k);
    }
    public static int Product_Less_Than_K(int[] arr,int k) {
		int ans=0;
		int si=0;
		int ei=0;
		int p=1;
		while(ei<arr.length) {
			//grow
			p=p*arr[ei];
			
			//shrink
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			
			//ans update
			ans = ans+(ei-si+1) ;
			ei++;
		}
		return ans;
		
	}
}