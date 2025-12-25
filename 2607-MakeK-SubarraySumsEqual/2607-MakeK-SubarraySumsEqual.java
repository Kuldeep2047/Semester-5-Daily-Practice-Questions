// Last updated: 12/25/2025, 7:10:32 PM
1class Solution {
2    public long makeSubKSumEqual(int[] arr, int k) {
3        return answer(arr, k);
4    }
5
6    public long answer(int[] arr ,int k){
7        int n = arr.length;
8        long ans =0;
9
10        // List<Integer> ll = new ArrayList<>();
11        boolean[] visited = new boolean[n];
12
13        for(int i=0 ;i<n ;i++){
14            if(visited[i]){
15
16            }else{
17                List<Integer> ll = new ArrayList<>();
18                int idx =i;
19
20                while(!visited[idx]){
21                    visited[idx] = true;
22                    ll.add(arr[idx]);
23
24                    idx = (idx + k)% n;
25                }
26
27                Collections.sort(ll);
28
29                int mid = ll.get(ll.size()/2);
30
31                for(int a : ll){
32                    ans += Math.abs(a - mid);
33                }
34
35            }
36            
37        }
38        return ans;
39    }
40}