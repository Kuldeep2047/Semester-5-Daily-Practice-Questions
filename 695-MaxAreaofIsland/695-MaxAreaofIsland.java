// Last updated: 12/30/2025, 12:14:07 PM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int ans =0;
4
5        for(int i=0 ;i<grid.length ;i++){
6            for(int j=0 ;j<grid[0].length ;j++){
7                if(grid[i][j] == 1){
8                    ans = Math.max(ans, Island(grid, i,j));
9                    
10                }
11            }
12        }
13        return ans;
14    }
15
16    public int Island(int[][] grid, int r, int c){
17        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] != 1){
18            return 0;
19        }
20
21        grid[r][c] = 2;
22
23        int bottom =  Island(grid, r+1, c);
24        int left =  Island(grid, r, c-1);
25        int up =  Island(grid, r-1, c);
26        int right =  Island(grid, r, c+1);
27
28        return bottom + left + up + right +1;
29    }
30}