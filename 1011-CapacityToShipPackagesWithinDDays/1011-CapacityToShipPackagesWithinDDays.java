// Last updated: 11/17/2025, 10:56:46 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        return Packages_Within_D_Days(weights,days);
    }
    public static int Packages_Within_D_Days(int[] weights,int days) {
		int start = weights[0];
		int end=0;
		for(int i=0;i<weights.length;i++) {
			end+=weights[i];
            start=Math.max(start,weights[i]);
		}
		int ans=0;
		while(start<=end) {
			int mid = (start+end)/2;
			if(ispossible(weights,days,mid)) {
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return ans;
		
	}
	public static boolean ispossible(int[] weights,int days,int mid) {
		int d=1;
		int wg=0; //weight
		for(int i=0;i<weights.length;i++) {
			wg+=weights[i];
			if(wg>mid) {
				d++;
				wg=weights[i];
				if(d>days) {
					return false;
				}
			}
			
		}
		return true;
	}
}