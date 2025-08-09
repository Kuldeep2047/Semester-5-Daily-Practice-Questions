// Last updated: 8/9/2025, 1:45:45 PM
class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
        
    }
    public static void sort(int[] arr) {
		int left=0;
		int right=arr.length-1;
		int i=0;
		while(i<=right) {
			if(arr[i]==0) {
				swap(arr,left,i);
				left++;
				i++;
			}else if(arr[i]==1) {
				i++;
			}else {
				swap(arr,i,right);
				right--;
				
			}
		}
		
	}
	
	public static void swap(int[] arr,int l,int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
}