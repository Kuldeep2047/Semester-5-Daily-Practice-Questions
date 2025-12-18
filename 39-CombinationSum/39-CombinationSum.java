// Last updated: 12/18/2025, 11:01:15 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4		List<Integer> ll = new ArrayList<>();
5		Combination(candidates,target,ll,0,ans);
6		return ans;
7        
8    }
9    public static void Combination(int[] coin, int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
10		if(amount==0) {
11			ans.add(new ArrayList<>(ll));
12			return;
13		}
14
15		for(int i=idx;i<coin.length;i++) {
16			if(amount>=coin[i]) {
17				ll.add(coin[i]);
18				Combination(coin,amount-coin[i],ll,i,ans);
19				ll.remove(ll.size()-1);
20			}
21		}
22	}
23}