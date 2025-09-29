// Last updated: 9/29/2025, 2:55:17 PM
class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r : row){
            rowChange(matrix, r);
        }
        for(int c : col){
            colChange(matrix ,c);
        }
        
        // int m=matrix.length;
        // int n = matrix[0].length;
        // int[] row = new int[m];
        // int[] col = new int[n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=1;
        //             col[j]=1;
        //         }
        //     }
        // }
        // assign_zero(matrix,row,col);    
    }

    public void rowChange(int[][] matrix, int r){
        for(int c =0;c<matrix[0].length ;c++){
            matrix[r][c]  =0;
        }
    }
    public void colChange(int[][] matrix, int c){
        for(int r =0;r<matrix.length ;r++){
            matrix[r][c]  =0;
        }
    }

    // public static int[][] assign_zero(int[][] arr,int[] row,int[] col){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[0].length;j++){
    //             if(row[i]==1  || col[j]==1){
    //                 arr[i][j]=0;
    //             }
    //         }
    //     }
    //     return arr;    
    // }
}