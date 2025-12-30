// Last updated: 12/30/2025, 1:08:29 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        return bfs(grid);
4    }
5
6    public int bfs(int[][] grid){
7        int n = grid.length;
8        
9        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
10            return -1;
11        }
12
13        int[][] dir = {{0,1},{1,1}, {1,0}, {1,-1},{0,-1}, {-1,-1}, {-1,0}, {-1,1}};
14        Queue<int[]> q= new LinkedList<>();
15        boolean[][] visited = new boolean[grid.length][grid[0].length];
16        visited[0][0] = true;
17
18        q.add(new int[]{0,0,1});
19
20        while(!q.isEmpty()){
21            int[] r= q.poll();
22
23            if(r[0] == n-1 && r[1] == n-1){
24                return r[2];
25            }
26
27            for(int[] d : dir){
28                int cr = r[0] + d[0];
29                int cc = r[1] + d[1];
30
31                if(cr<0 || cc<0 || cr>=n || cc>=n || visited[cr][cc] || grid[cr][cc] == 1){
32                    continue;
33                }
34                visited[cr][cc] = true;
35                q.add(new int[]{cr, cc, r[2]+1});
36            }
37        }
38        return -1;
39
40
41
42
43
44    }
45}