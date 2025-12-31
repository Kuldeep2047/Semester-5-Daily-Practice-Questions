// Last updated: 12/31/2025, 12:09:50 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        return topological_sort(numCourses, prerequisites);
4    }
5    public int[] topological_sort(int V, int[][] edges){
6        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
7        
8        for(int i=0 ;i<V ;i++){
9            map.put(i, new ArrayList<>());
10        }
11        
12        for(int i=0 ;i<edges.length ;i++){
13            map.get(edges[i][1]).add(edges[i][0]);
14        }
15        
16        int[] in = new int[V];
17        
18        for(int key : map.keySet()){
19            for(int i : map.get(key)){
20                in[i]++;
21            }
22        }
23        
24        Queue<Integer> q= new LinkedList<>();
25        ArrayList<Integer> ll = new ArrayList<>();
26        
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
47        if(ll.size() < V){
48            return new int[0];
49        }
50        int[] arr = new int[ll.size()];
51        int c =0;
52        for(int a : ll){
53            arr[c++] = a;
54        }
55        return arr;
56    }
57}