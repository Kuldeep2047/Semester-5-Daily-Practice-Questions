// Last updated: 8/9/2025, 1:37:59 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        return Time_to_Repair(ranks,cars);
    }
    public static long Time_to_Repair(int[] ranks,int cars) {
		int n = ranks.length;
		Arrays.sort(ranks);
		long start =1;
		long end = (long)ranks[n-1]*cars*cars;
		long ans=0;
		while(start<=end) {
			long mid = (start+end)/2;
			if(ispossible(ranks,cars,mid)) {
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return ans;
		
	}
	
	public static boolean ispossible(int[] ranks,int cars,long mid) {
		int n = ranks.length;
		int c=0;
		for(int i=0;i<n;i++) {
			// int cr = (int)Math.sqrt(mid/ranks[i]);  //Number of char repair by ith person
			c += (int)Math.sqrt(mid/ranks[i]); 
			if(c>=cars) {
				return true;
			}
			
		}
		return false;
		
	}
}