// Last updated: 10/7/2025, 9:31:26 PM
class Solution {
    int ans =0;
    int count =1;
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int empty = 0;  //count of free cell
        int sr = 0;     //tr --> starting row
        int sc = 0;     //tc --> starting column
        for(int i=0 ;i<n;i++){
            for(int j =0 ;j<m ;j++){
                if(grid[i][j] == 0){
                    count++;
                }else if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
            }
        }

        Unique_Path(grid, sr, sc);
        return ans;

    }

    public void Unique_Path(int[][] grid, int cr, int cc){
        if(cr<0 || cc<0 || cr>=grid.length || cc>=grid[0].length){
            return;
        }
        if(grid[cr][cc] == -1){
            return;
        }
        if(grid[cr][cc] == 2 && count == 0){
            ans++;
            return;
        }

        int temp = grid[cr][cc];
        grid[cr][cc] = -1;

        count--;
        Unique_Path(grid, cr-1, cc);
        Unique_Path(grid, cr, cc+1);
        Unique_Path(grid, cr+1, cc);
        Unique_Path(grid, cr, cc-1);
        count++;

        grid[cr][cc] = temp;
    }
}