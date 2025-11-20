// Last updated: 11/20/2025, 2:49:07 PM
class Solution {
    public int minimumArea(int[][] grid) {
        return answer(grid);
    }
    public static int answer(int[][] grid){

        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;
        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;

        for(int i=0 ;i<grid.length ;i++){
            for(int j=0; j<grid[0].length ;j++){
                if(grid[i][j] == 1){
                    minr = Math.min(minr, i);
                    maxr = Math.max(maxr, i);
                    
                    minc = Math.min(minc, j);
                    maxc = Math.max(maxc, j);
                }

            }
        }
        int r = maxr- minr+1;
        int c = maxc - minc+1;
        return r*c;
    }
}