// Last updated: 8/9/2025, 1:44:45 PM
class Solution {
    public int majorityElement(int[] nums) {
        return Moore_Voting(nums);
    }
    public static int Moore_Voting(int[] arr) {
		int e=arr[0];
		int v=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==e) {
				v++;
			}else {
				v--;
				if(v==0) {
					e=arr[i];
					v=1;
				}
			}
		}
		return e;
	}
}