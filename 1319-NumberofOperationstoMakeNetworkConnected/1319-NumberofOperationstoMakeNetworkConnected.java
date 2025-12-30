// Last updated: 12/30/2025, 9:19:22 PM
1class Solution {
2    public int makeConnected(int n, int[][] connections) {
3        if(n-1 > connections.length){
4            return -1;
5        }
6        return answer(n, connections);
7    }
8
9    public int answer(int n, int[][] arr){
10        int m = arr.length;
11
12        HashMap<Integer, List<Integer>> map = new HashMap<>();
13        for(int i=0; i<n ;i++){
14            map.put(i, new ArrayList<>());
15        }
16        for(int i=0 ; i<arr.length ;i++){
17            map.get(arr[i][0]).add(arr[i][1]);
18            map.get(arr[i][1]).add(arr[i][0]);
19        }
20
21        int comp=0;
22        Queue<Integer> q = new LinkedList<>();
23        HashSet<Integer> visited = new HashSet<>();
24
25        for(int src : map.keySet()){
26            if(visited.contains(src)){
27                continue;
28            }
29            comp++;
30
31            q.add(src);
32            while(!q.isEmpty()){
33                int r = q.poll();
34                if(visited.contains(r)){
35                    continue;
36                }
37
38                visited.add(r);
39
40                for(int nbrs : map.get(r)){
41                    if(!visited.contains(nbrs)){
42                        q.add(nbrs);
43                    }
44                }
45            }
46        }
47        return comp -1;
48    }
49}