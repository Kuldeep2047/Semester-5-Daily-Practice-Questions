// Last updated: 8/9/2025, 1:36:51 PM
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            sortdiagonal(grid,i,0,false);
        }
        for(int j=1;j<n;j++){
            sortdiagonal(grid,0,j,true);
        }
        return grid;
    }

    public static void sortdiagonal(int[][] grid,int r,int c,boolean asc){
        int n = grid.length;
        List<Integer> ll = new ArrayList<>();
        int row = r;
        int col =c;
        while(row<n && col<n){
            ll.add(grid[row][col]);
            row++;
            col++;
        }
        if(asc){
            Collections.sort(ll);
        }else{
            ll.sort(Collections.reverseOrder());
        }

        row = r;
        col = c;
        int idx = 0;
        while(row<n && col<n){
            grid[row][col] = ll.get(idx++);
            row++;
            col++;
        }
    }
}