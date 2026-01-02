// Last updated: 1/2/2026, 11:52:35 AM
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        int v = graph.length;
4        List<List<Integer>> ans = new ArrayList<>();
5        List<Integer> ll = new ArrayList<>();
6        int src = 0;
7        int des = v-1;
8
9        ll.add(src);
10        answer(graph,ans, ll, src,des);
11        return ans;
12    }
13
14    public void answer(int[][] graph, List<List<Integer>> ans, List<Integer> ll, int src, int des){
15        if(src == des){
16            ans.add(new ArrayList<>(ll));
17            return ;
18        }
19
20        for(int nbrs : graph[src]){
21            ll.add(nbrs);
22            answer(graph, ans, ll, nbrs, des);
23            ll.remove(ll.size()-1);
24        }
25    }
26}