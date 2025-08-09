// Last updated: 8/9/2025, 1:45:48 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        assign_zero(matrix,row,col);
        
        
    }
    public static int[][] assign_zero(int[][] arr,int[] row,int[] col){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==1  || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;    
    }
}