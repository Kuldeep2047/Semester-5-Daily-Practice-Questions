// Last updated: 9/26/2025, 10:06:18 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return minSpeed(piles,h);
    }
    public static int minSpeed(int[] piles , int h) {
		Arrays.sort(piles);
		int n = piles.length;
		int start=1;
		int end= piles[n-1];
		int ans=end;
		while(start<=end) {
			int mid = (start+end)/2;
			if(isPossible(piles,h,mid)) {
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	public static boolean isPossible(int[] piles, int h, int mid) {
		int c=0;
		for(int i=0;i<piles.length;i++) {
			c += Math.ceil((double)piles[i]/mid);
			if(c>h) {
				return false;
			}
		}
		return true;
	}
}