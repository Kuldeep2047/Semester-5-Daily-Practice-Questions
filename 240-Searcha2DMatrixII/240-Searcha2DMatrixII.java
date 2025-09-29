// Last updated: 9/29/2025, 7:17:22 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Stair_Case_Searching(matrix,target);
    }
    public static boolean Stair_Case_Searching(int[][] arr,int item) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length &&  col>=0) {
			if(arr[row][col]==item) {
				return true;
			}else if(arr[row][col]>item) {
				col--;
			}else {
				row++;
			}
		}
		return false;
		
	}
}