// Last updated: 9/29/2025, 7:06:22 PM
class Solution {
    public int numIslands(char[][] grid) {
        int ans =0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    Islands(grid,i,j);
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void Islands(char[][] grid,int cr,int cc){
        if(cc<0 || cr<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]!='1'){
            return;
        }

        grid[cr][cc] = '*';

        Islands(grid,cr+1,cc);
        Islands(grid,cr-1,cc);
        Islands(grid,cr,cc+1);
        Islands(grid,cr,cc-1);
    }
}