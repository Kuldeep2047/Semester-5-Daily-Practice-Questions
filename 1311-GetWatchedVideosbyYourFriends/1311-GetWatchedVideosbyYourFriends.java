// Last updated: 1/1/2026, 10:53:08 PM
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
3
4        //bfs
5        Queue<Integer> q = new LinkedList<>();
6        HashSet<Integer> visited = new HashSet<>();
7
8        q.add(id);
9        visited.add(id);
10        int currLevel = 0;
11
12        while(!q.isEmpty() && currLevel < level){
13            int size = q.size();
14            while (size-- > 0) {
15                // 1. remove
16                int r = q.poll();
17
18                
19
20                // 4. self work (nothing here for this problem)
21
22                // 5. Add unvisited neighbours
23                for(int nbr : friends[r]){
24                    if(!visited.contains(nbr)){
25                        visited.add(nbr);
26                        q.add(nbr);
27                    }
28                }
29            }
30            currLevel++;
31        }
32
33        // Collect videos at target level
34        HashMap<String, Integer> freq = new HashMap<>();
35
36        while(!q.isEmpty()){
37            int person = q.poll();
38
39            for(String video : watchedVideos.get(person)){
40                freq.put(video, freq.getOrDefault(video, 0) + 1);
41            }
42        }
43
44        // Sort ans
45        List<String> result = new ArrayList<>(freq.keySet());
46        Collections.sort(result, (a, b) -> {
47            if (!freq.get(a).equals(freq.get(b))) {
48                return freq.get(a) - freq.get(b);
49            }
50            return a.compareTo(b);
51        });
52
53        return result;
54    }
55}