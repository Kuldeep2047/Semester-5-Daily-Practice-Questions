// Last updated: 10/13/2025, 6:46:46 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans =0;
        for(int i=0 ;i<grid.length ;i++){
            for(int j=0;j<grid[0].length ;j++){
                if(grid[i][j] != 0){
                    ans = Math.max(ans, maxGold(grid, i ,j));
                }
            }
        }
        return ans;
    }

    public int maxGold(int[][] grid, int cr, int cc){
        if(cr<0 || cr>=grid.length || cc<0 || cc>=grid[0].length || grid[cr][cc] ==0){
            return 0;
        }
        
        int gold = grid[cr][cc];
        grid[cr][cc] = 0;

        int left = maxGold(grid, cr, cc-1);
        int top = maxGold(grid, cr-1, cc);
        int right = maxGold(grid, cr, cc+1);
        int bottom = maxGold(grid, cr+1, cc);

        grid[cr][cc] = gold;

        return gold + Math.max( Math.max(left, top), Math.max(right, bottom) );
    }
}