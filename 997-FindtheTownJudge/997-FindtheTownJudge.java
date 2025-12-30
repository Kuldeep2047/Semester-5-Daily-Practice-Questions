// Last updated: 12/30/2025, 11:17:23 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        return answer(n,trust);
4    }
5
6    public int answer(int n, int[][] arr){
7        int[] in = new int[n+1];
8        int[] out = new int[n+1];
9
10        for(int[] a : arr){
11            out[a[0]]++;
12            in[a[1]]++;
13        }
14
15        for(int i=1 ;i<=n ;i++){
16            if(in[i] == n-1 && out[i] == 0){
17                return i;
18            }
19        }
20        return -1;
21    }
22}