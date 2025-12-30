// Last updated: 12/30/2025, 8:50:23 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        return answer(isConnected);
4    }
5
6    public int answer(int[][] mat){
7        int n = mat.length;
8
9        //create graph
10        HashMap<Integer, List<Integer>> map = new HashMap<>();
11        for(int i=1 ;i<=n ;i++){
12            map.put(i, new ArrayList<>());
13        }
14        for(int i=0; i<n ;i++){
15            for(int j=0 ;j<n ;j++){
16                if(i != j && mat[i][j] == 1){
17                    map.get(i+1).add(j+1);
18                    map.get(j+1).add(i+1);
19                }
20            }
21        }
22
23        //now apply bfs to find no. of components
24        Queue<Integer> q = new LinkedList<>();
25        HashSet<Integer> visited = new HashSet<>();
26        int com =0;
27
28        for(int src : map.keySet()){
29            if(visited.contains(src)){
30                continue;
31            }
32            com++;
33            q.add(src);
34
35            while(!q.isEmpty()){
36                // remove
37                int r = q.poll();
38
39                // ignore if visited
40                if(visited.contains(r)){
41                    continue;
42                }
43                // mark visited
44                visited.add(r);
45                // self work
46
47                // add unvisited nbrs
48                for(int nbrs : map.get(r)){
49                    if(!visited.contains(nbrs)){
50                        q.add(nbrs);
51                    }
52                }
53
54            }
55        }
56        return com;
57
58        
59    }
60}