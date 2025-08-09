// Last updated: 8/9/2025, 1:42:03 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        return transpose_matrix(matrix);
    }
    public static int[][] transpose_matrix(int[][] arr){
        int r=arr.length;
        int c = arr[0].length;
        int[][] trans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                trans[i][j]=arr[j][i];
            }
        }
        return trans;
    }
}