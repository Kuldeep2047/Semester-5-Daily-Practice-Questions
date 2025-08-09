// Last updated: 8/9/2025, 1:46:27 PM
class Solution {
    public int search(int[] nums, int target) {
        return Search(nums,target);
    }
    public static int Search(int[] arr, int item) {
		for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
		return -1;

	}
}