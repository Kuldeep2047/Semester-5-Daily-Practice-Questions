// Last updated: 11/22/2025, 5:28:22 PM
class Solution {
    private HashMap<Integer,HashMap<Integer,Integer>> map;

    public void AddEdge(int v1 ,int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map = new HashMap<>();
        for(int i=0 ;i<n ;i++){
            map.put(i, new HashMap<>());
        }

        for(int[] arr : edges){
            AddEdge(arr[0], arr[1], 0);
        }

        return path(source, destination);
    }

    public boolean path(int src, int des){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int r  = q.poll();

            if(visited.contains(r)){
                continue;
            }

            visited.add(r);

            if(r == des){
                return true;
            }

            for(int nbrs : map.get(r).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
}