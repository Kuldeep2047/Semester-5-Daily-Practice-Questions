// Last updated: 8/9/2025, 1:38:30 PM
class Solution {
    public int equalPairs(int[][] grid) {
        return isEqual(grid);
    }

    public static int isEqual(int[][] grid){
        int n = grid.length;
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> ll = new ArrayList<>();
            for(int j=0;j<n;j++){
                ll.add(grid[i][j]);
            }
            map.put(ll,map.getOrDefault(ll,0)+1);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(grid[j][i]);
            }
            if(map.containsKey(list)){
                ans += map.get(list);
            }

        }
        return ans;
    }

    // public static int isEqual(int[][] grid){
    //     int n = grid.length;
    //     int m = grid[0].length;
    //     int ans=-0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             int f=0;
    //             for(int k=0;k<m;k++){
    //                 if(grid[i][k] != grid[k][j]){
    //                     f=1;
    //                     break;
    //                 }
    //             }
    //             if(f==0){
    //                 ans++;
    //             }
    //         }
            
    //     }
    //     return ans;
    // }
}