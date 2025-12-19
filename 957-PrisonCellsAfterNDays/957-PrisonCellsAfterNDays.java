// Last updated: 12/19/2025, 10:34:46 PM
1class Solution {
2    public int[] prisonAfterNDays(int[] cells, int n) {
3        return answer(cells, n);
4    }
5
6    public int[] answer(int[] cells, int n){
7        Map<String, Integer> map = new HashMap<>();
8        boolean cycleFound = false;
9        int len = 0;
10
11        while(n > 0){
12
13            String key = Arrays.toString(cells);
14
15            if(!cycleFound){
16                if(map.containsKey(key)){
17                    len = map.get(key) - n;
18
19                    n %= len;
20                    cycleFound = true;
21                } 
22                else{
23                    map.put(key, n);
24                }
25            }
26
27            if (n > 0) {
28                cells = nextDay(cells);
29                n--;
30            }
31        }
32
33        return cells;
34    }
35
36    public int[] nextDay(int[] cells) {
37        int[] arr = new int[8];
38
39        for (int i = 1; i < 7; i++) {
40            arr[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
41        }
42
43        return arr;
44    }
45}
46