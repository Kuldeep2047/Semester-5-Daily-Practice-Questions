// Last updated: 12/20/2025, 4:13:35 PM
1class Solution {
2    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
3        return answer(blocked, source, target);
4    }
5    public boolean answer(int[][] blocked, int[] source, int[] target){
6        Set<String> set = new HashSet<>();
7
8        for(int[] arr : blocked){
9            set.add(arr[0]+" "+arr[1]);
10        }
11
12        boolean a = BFS(source, target, set);
13        boolean b = BFS(target, source, set);
14
15        return a && b;
16    }
17
18    public boolean BFS(int[] src, int[] des, Set<String> block){
19        Queue<int[]> q = new LinkedList<>();
20        Set<String> visited = new HashSet<>();
21
22        q.add(src);
23        while(!q.isEmpty()){
24            //1.remove
25            int[] r = q.poll();
26
27            String key = r[0]+" "+r[1];
28
29            //2.ignore if visited
30            if(visited.contains(key)){
31                continue;
32            }
33
34            //3. mark visited
35            visited.add(key);
36
37            //4. self work
38            if(r[0] == des[0] && r[1] == des[1]){
39                return true;
40            }
41
42            if(visited.size()> 20000){
43                return true;
44            }
45
46            //5. Add unvisited nbrs
47            int[][] dir = {{1,0},{-1, 0}, {0,1},{0,-1}};
48
49            for(int[] d : dir){
50                int x = r[0] + d[0];
51                int y = r[1]+d[1];
52                if(x<0 || y<0 || x>=1000000 || y>=1000000){
53                    continue;
54                }
55
56                String newKey = x+" "+y;
57                if(!visited.contains(newKey) && !block.contains(newKey)){
58                    q.add(new int[]{x, y});
59                }
60            }
61
62
63        }
64        return false;
65
66    }
67}