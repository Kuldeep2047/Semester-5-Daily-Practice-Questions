// Last updated: 12/30/2025, 11:39:49 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count =0;
4
5        for(int i=0 ;i<grid.length ;i++){
6            for(int j=0 ;j<grid[0].length ;j++){
7                if(grid[i][j] == '1'){
8                    Island(grid, i,j);
9                    count++;
10                }
11            }
12        }
13        return count;
14        
15    }
16    public void Island(char[][] grid, int r, int c){
17        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] != '1'){
18            return;
19        }
20
21        grid[r][c] = '*';
22
23        Island(grid, r+1, c);
24        Island(grid, r, c-1);
25        Island(grid, r-1, c);
26        Island(grid, r, c+1);
27    }
28}