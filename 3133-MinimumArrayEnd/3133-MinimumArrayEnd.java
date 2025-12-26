// Last updated: 12/26/2025, 4:02:54 PM
1class Solution {
2    public long minEnd(int n, int x) {
3        return answer(n,x);
4    }
5    public long answer(int n, int x){
6
7        long num =x;
8        for(int i=1; i<n ;i++){
9            num = (num +1) | x;
10        }
11
12        return num;
13    }
14}