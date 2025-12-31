// Last updated: 12/31/2025, 11:33:53 PM
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int[][] dir = {{1, 0}, {0,-1}, {-1,0}, {0 ,1}};
4        int n = grid.size();
5        int m = grid.get(0).size();
6        boolean[][] visited = new boolean[n][m];
7        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[2] - a[2]);
8
9        health = health - grid.get(0).get(0);
10
11        pq.add(new int[]{0,0,health});
12
13
14        while(!pq.isEmpty()){
15            //remove
16            int[] r = pq.poll();
17
18            //ignore if visited
19            if(visited[r[0]][r[1]] == true){
20                continue;
21            }
22            // mark visited
23            visited[r[0]][r[1]] = true;
24
25            //self work
26            if(r[0] == n-1 && r[1] == m-1 && health >=1){
27                return true;
28            }
29
30            //add nbrs
31            for(int[] d : dir){
32                int cr = r[0] + d[0];
33                int cc = r[1] + d[1];
34
35                if(cr<0 || cc<0 || cr >=n || cc>=m || visited[cr][cc]){
36                    continue;
37                }
38                int newHealth = r[2] - grid.get(cr).get(cc);
39
40                if(newHealth >= 1){
41                    pq.add(new int[]{cr, cc, newHealth});
42                }
43            }
44        }
45        return false;
46
47
48    }
49}