// Last updated: 12/30/2025, 3:50:35 PM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        return answer(mat);
4    }
5
6    public int[][] answer(int[][] mat){
7        int n = mat.length;
8        int m = mat[0].length;
9        int[][] dir = {{1,0}, {0,-1}, {-1,0}, {0,1}};
10        Queue<int[]> q = new LinkedList<>();
11        // boolean[][] visited = new boolean[n][m];
12        int[][] ans = new int[n][m];
13
14        for(int i=0 ;i<n ;i++){
15            for(int j=0 ;j<m ;j++){
16                if(mat[i][j] == 0){
17                    q.add(new int[]{i,j});
18                    ans[i][j] = 0;
19                }else{
20                    ans[i][j] = -1;
21                }
22            }
23        }
24
25        while(!q.isEmpty()){
26            int[] r =q.poll();
27            for(int[] d : dir){
28                int cr = r[0] + d[0];
29                int cc = r[1] + d[1];
30
31                if(cr<0 || cc<0 || cr>=n ||cc >=m || ans[cr][cc] != -1){
32                    continue;
33                }
34                ans[cr][cc] = ans[r[0]][r[1]] + 1;
35
36                q.add(new int[]{cr, cc});
37
38            }
39
40        }
41        return ans;
42
43
44    }
45}