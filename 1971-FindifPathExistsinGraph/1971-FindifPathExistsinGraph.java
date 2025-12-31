// Last updated: 12/31/2025, 10:32:43 AM
1class Solution {
2    private HashMap<Integer,HashMap<Integer,Integer>> map;
3
4    public void AddEdge(int v1 ,int v2, int cost){
5        map.get(v1).put(v2, cost);
6        map.get(v2).put(v1, cost);
7    }
8    public boolean validPath(int n, int[][] edges, int source, int destination) {
9        map = new HashMap<>();
10        for(int i=0 ;i<n ;i++){
11            map.put(i, new HashMap<>());
12        }
13
14        for(int[] arr : edges){
15            AddEdge(arr[0], arr[1], 0);
16        }
17
18        return path(source, destination);
19    }
20
21    public boolean path(int src, int des){
22        HashSet<Integer> visited = new HashSet<>();
23        Queue<Integer> q = new LinkedList<>();
24        q.add(src);
25
26        while(!q.isEmpty()){
27            int r  = q.poll();
28
29            if(visited.contains(r)){
30                continue;
31            }
32
33            visited.add(r);
34
35            if(r == des){
36                return true;
37            }
38
39            for(int nbrs : map.get(r).keySet()){
40                if(!visited.contains(nbrs)){
41                    q.add(nbrs);
42                }
43            }
44        }
45        return false;
46    }
47}