// Last updated: 8/9/2025, 1:42:22 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        return answer(matrix);
    }
    public static boolean answer(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] != arr[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}