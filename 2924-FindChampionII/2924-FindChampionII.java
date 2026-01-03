// Last updated: 1/3/2026, 9:44:56 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        return answer(n, edges);
4
5    }
6    public int answer(int n, int[][] edges){
7        //find in degree
8        int in[] = new int[n];
9        for(int i=0 ;i<edges.length ;i++){
10            in[edges[i][1]]++;
11        }
12
13        int ans =0;
14        int count =0;
15        for(int i=0 ;i< n ;i++){
16            if(in[i] == 0){
17                ans = i;
18                count++;
19            }
20        }
21
22        if(count >1){
23            return -1;
24        }
25        return ans;
26
27    }
28}