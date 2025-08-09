// Last updated: 8/9/2025, 1:44:02 PM
class Solution {
    public void moveZeroes(int[] nums) {
        move_zero(nums);
    }
    public static void move_zero(int[] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[c]=arr[i];
				c++;
			}
		}
		while(c<arr.length) {
			arr[c]=0;
			c++;
		}
	}
}