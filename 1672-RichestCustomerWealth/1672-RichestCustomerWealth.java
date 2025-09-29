// Last updated: 9/29/2025, 12:03:40 PM
class Solution {
    public int[][] construct2DArray(int[] arr, int r, int c) {
        int idx =0;
        if(arr.length!=r*c) return new int[0][0];
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = arr[idx++];
            }
        }

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println(" ");
        // }
        return mat;
    }
    
}