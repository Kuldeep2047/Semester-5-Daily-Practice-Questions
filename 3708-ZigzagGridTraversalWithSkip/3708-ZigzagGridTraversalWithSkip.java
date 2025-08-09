// Last updated: 8/9/2025, 1:37:03 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        return zigzag(grid);
    }
    public static List<Integer> zigzag(int[][] grid){
        List<Integer> l = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j+=2){
                    l.add(grid[i][j]);
                }
            }else{
                if( m%2 !=0){
                    for(int j=m-2;j>=0;j-=2){
                        l.add(grid[i][j]);
                    }
                }else{
                    for(int j=m-1;j>=0;j-=2){
                        l.add(grid[i][j]);
                    }
                }
            }
        }
        return l;
    }
}