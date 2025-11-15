// Last updated: 11/15/2025, 9:27:25 PM
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        ll.add(0);
        answer(0, n-1,graph, ans, ll) ;
        return ans;
    }

    public static void answer(int src, int des, int[][] graph , List<List<Integer>> ans, List<Integer> ll){
        if(src == des){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int nbrs : graph[src]){
            ll.add(nbrs);
            answer(nbrs, des, graph, ans, ll);

            ll.remove(ll.size()-1);
        }


    }
}