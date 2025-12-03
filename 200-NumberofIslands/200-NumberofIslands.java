// Last updated: 12/3/2025, 10:06:01 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int ans =0;
4        int n = grid.length;
5        int m = grid[0].length;
6
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                if(grid[i][j]=='1'){
10                    Islands(grid,i,j);
11                    ans++;
12                }
13            }
14        }
15
16        return ans;
17    }
18
19    public static void Islands(char[][] grid,int cr,int cc){
20        if(cc<0 || cr<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]!='1'){
21            return;
22        }
23
24        grid[cr][cc] = '*';
25
26        Islands(grid,cr+1,cc);
27        Islands(grid,cr-1,cc);
28        Islands(grid,cr,cc+1);
29        Islands(grid,cr,cc-1);
30    }
31}