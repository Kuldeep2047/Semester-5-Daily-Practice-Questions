// Last updated: 8/9/2025, 1:43:39 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int[] arr = new int[matrix.length*matrix[0].length];
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[c++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}