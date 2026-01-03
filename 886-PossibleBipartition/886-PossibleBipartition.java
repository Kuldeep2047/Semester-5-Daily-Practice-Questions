// Last updated: 1/3/2026, 9:30:49 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=1; i<=n; i++) {
5            map.put(i, new ArrayList<>());
6        }
7        for(int i=0; i<dislikes.length; i++) {
8            int a = dislikes[i][0];
9            int b = dislikes[i][1];
10            map.get(a).add(b);
11            map.get(b).add(a);
12        }
13        if(isBipartite(map)){
14            return true;
15        }
16        return false;
17       
18    }
19
20    class Pair{
21        int vtx;
22        int dis;
23        Pair(int vtx, int dis) {
24            this.vtx = vtx;
25            this.dis = dis;
26        }
27    }
28    public boolean isBipartite(Map<Integer, List<Integer>> map) {
29        Queue<Pair> q = new LinkedList<>();
30        HashMap<Integer, Integer> visited = new HashMap<>();
31        for(int key: map.keySet()) {
32            if(visited.containsKey(key)){
33                continue;
34            }
35            q.add(new Pair(key, 0));
36            while(!q.isEmpty()) {
37                //remove
38                Pair rv = q.poll();
39
40                //ignore if visited
41                if(visited.containsKey(rv.vtx)) {
42                    if(visited.get(rv.vtx)!=rv.dis){
43                        return false;
44                    }
45                    continue;
46                }
47
48                //mark visited
49                visited.put(rv.vtx, rv.dis);
50                // add nbrs;
51                for(int nbrs: map.get(rv.vtx)) {
52                    if(!visited.containsKey(nbrs)) {
53                        q.add(new Pair(nbrs, rv.dis+1));
54                    }
55                }
56
57            }
58        
59        }
60        return true;
61    }
62    
63
64}
65    