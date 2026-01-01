// Last updated: 1/1/2026, 10:54:16 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        int v = edges.length+1;
5        for(int i=1 ;i<=v ;i++){
6            map.put(i, new ArrayList<>());
7        }
8        for(int i=0 ;i<edges.length ;i++){
9            map.get(edges[i][0]).add(edges[i][1]);
10            map.get(edges[i][1]).add(edges[i][0]);
11        }
12
13        for(int key : map.keySet()){
14            if(map.get(key).size()== v-1){
15                return key;
16            }
17        }
18        return -1;
19    }
20}