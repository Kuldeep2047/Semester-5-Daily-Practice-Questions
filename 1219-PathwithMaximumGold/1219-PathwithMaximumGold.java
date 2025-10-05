// Last updated: 10/5/2025, 4:34:31 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length ;i++){
            for(int j = 0; j<grid[0].length ;j++){
                if(grid[i][j] != 0){
                    int gold = max_gold(grid , i, j);
                    ans = Math.max(ans, gold);
                }
            }
        }
        return ans;
        
    }

    public int max_gold(int[][] grid , int cr ,int cc){
        if(cr<0 || cr>=grid.length || cc<0 || cc>=grid[0].length || grid[cr][cc] == 0){
            return 0;
        }

        int gold = grid[cr][cc];
        grid[cr][cc] = 0;   //ye visited mark ker diya

        int left = max_gold(grid, cr , cc-1);
        int right = max_gold(grid, cr, cc+1);
        int top = max_gold(grid, cr-1, cc);
        int bottom = max_gold(grid, cr+1, cc);

        grid[cr][cc] = gold ;  //backtrack se unvisited ker diya

        return gold + Math.max( Math.max(left, right), Math.max(top, bottom));

        
    }
}