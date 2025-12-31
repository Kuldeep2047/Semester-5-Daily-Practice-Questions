// Last updated: 12/31/2025, 3:38:29 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        return answer(times, n, k);
4    }
5    class DijkstraPair {
6		int vtx;
7		int cost;
8
9		public DijkstraPair(int vtx, int cost) {
10			// TODO Auto-generated constructor stub
11			this.vtx = vtx;
12			this.cost = cost;
13		}
14
15		
16	}
17    public HashMap<Integer, Integer> Dijkstra(HashMap<Integer, HashMap<Integer, Integer>> map, int k, HashMap<Integer, Integer> find){
18		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
19		HashSet<Integer> visited = new HashSet<>();
20		pq.add(new DijkstraPair(k, 0));
21		while (!pq.isEmpty()) {
22			
23			DijkstraPair rp = pq.poll();
24			
25			if (visited.contains(rp.vtx)) {
26				continue;
27			}
28			
29			visited.add(rp.vtx);
30			
31			// System.out.println(rp);
32            find.put(rp.vtx, rp.cost);
33			
34			for (int nbrs : map.get(rp.vtx).keySet()) {
35				if (!visited.contains(nbrs)) {
36					int cost = map.get(rp.vtx).get(nbrs);
37					pq.add(new DijkstraPair(nbrs,  rp.cost + cost));
38				}
39			}
40		}
41
42        return find;
43	}
44
45    public int answer(int[][] times, int n, int k){
46        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
47        for(int i=1 ;i<=n ;i++){
48            map.put(i, new HashMap<>());
49        }
50
51        for(int i=0 ;i<times.length ;i++){
52            map.get(times[i][0]).put(times[i][1], times[i][2]);
53        }
54
55        HashMap<Integer, Integer> find = new HashMap<>();
56        Dijkstra(map, k, find);
57
58        if(find.size() < n){
59            return -1;
60        }
61        int max = Integer.MIN_VALUE;
62        for(int key: find.keySet()) {
63            max = Math.max(find.get(key), max);
64        }
65        return max;
66
67    }
68}