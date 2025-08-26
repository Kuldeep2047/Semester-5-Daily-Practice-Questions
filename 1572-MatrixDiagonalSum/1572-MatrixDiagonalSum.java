// Last updated: 8/26/2025, 6:37:17 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j == n-1){
                    sum += mat[i][j];
                }
                
            }
        }
        return sum;
    }
}