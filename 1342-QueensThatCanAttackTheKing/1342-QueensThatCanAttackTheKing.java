// Last updated: 8/9/2025, 1:41:13 PM
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        return Queen(queens,king);
    }
    public static List<List<Integer>> Queen(int[][] queens,int[] king){
        boolean[][] board = new boolean[8][8];
        for(int i =0;i<queens.length;i++){
            board[queens[i][0]][queens[i][1]] = true;
        }
        
        List<List<Integer>> ans = new ArrayList<>();

        int[][] dir = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        for(int row=0; row<dir.length; row++){
            int x  = king[0];
            int y = king[1];
            while(x>=0 && x<8 && y>=0 && y<8){
                if(board[x][y]==true){
                    
                    ans.add(Arrays.asList(x, y));
                    break;
                }
                x+=dir[row][0];
                y+=dir[row][1];
            }
        }
        return ans;
    }
}