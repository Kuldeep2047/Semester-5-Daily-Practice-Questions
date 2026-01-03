// Last updated: 1/3/2026, 12:35:30 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        return answer(numRows);     
4        
5    }
6    public List<List<Integer>> answer(int n){
7        List<List<Integer>> ans = new ArrayList<>();
8
9        for(int i=1; i<=n; i++) {
10            List<Integer> ll = new ArrayList<>();
11            int res = 1;
12            ll.add(res);
13            for(int j=1; j<i; j++) {
14                res = res * (i-j);
15                res = res / j;
16                ll.add(res);
17            } 
18            ans.add(ll);
19        }
20        return ans;
21    }
22}