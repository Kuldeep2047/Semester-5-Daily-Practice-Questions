// Last updated: 8/9/2025, 1:36:14 PM
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        return answer(grid,k);
    }
    public static int[][] answer(int[][] mat,int window){
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] result = new int[rows-window+1][cols-window+1];

        for(int r =0;r<=rows-window;r++){
            for(int c =0;c<=cols-window;c++){
                int[] block = new int[window*window];
                int idx =0;
                for(int i=r;i<r+window;i++){
                    for(int j = c;j<c+window;j++){
                        block[idx++] = mat[i][j];
                    }
                }
                Arrays.sort(block,0,idx);
                int min = Integer.MAX_VALUE;

                for(int i=1;i<idx;i++){
                    if(block[i] != block[i-1]){
                        min = Math.min(min,block[i]-block[i-1]);
                    }
                }
                result[r][c] = (min==Integer.MAX_VALUE) ? 0 : min;
            }
        }
        return result;
    }
}