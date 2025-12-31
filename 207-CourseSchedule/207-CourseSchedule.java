// Last updated: 12/31/2025, 12:00:12 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        return topological_sort(numCourses, prerequisites);
4    }
5
6    public boolean topological_sort(int V, int[][] edges){
7        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
8        
9        for(int i=0 ;i<V ;i++){
10            map.put(i, new ArrayList<>());
11        }
12        
13        for(int i=0 ;i<edges.length ;i++){
14            map.get(edges[i][0]).add(edges[i][1]);
15        }
16        
17        int[] in = new int[V];
18        
19        for(int key : map.keySet()){
20            for(int i : map.get(key)){
21                in[i]++;
22            }
23        }
24        
25        Queue<Integer> q= new LinkedList<>();
26        ArrayList<Integer> ll = new ArrayList<>();
27        
28        for(int i=0 ;i<in.length ;i++){
29            if(in[i] == 0){
30                q.add(i);
31            }
32        }
33        
34        while(!q.isEmpty()){
35            int r = q.poll();
36            
37            ll.add(r);
38            for(int nbrs : map.get(r)){
39                in[nbrs]--;
40                
41                if(in[nbrs] == 0){
42                    q.add(nbrs);
43                }
44            }
45        }
46        
47        return ll.size() == V;
48    }
49}