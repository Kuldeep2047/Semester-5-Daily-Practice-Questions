// Last updated: 8/9/2025, 1:46:05 PM
class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        return Queen(board,0,n,ans);
        
        
    }
    
    public static int Queen(boolean[][] board,int row,int tq,List<List<String>> ans){
        if(tq==0){
            // ans.add(make(board));
            return 1;
        }
        int c=0;
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                c+=Queen(board,row+1,tq-1,ans);
                board[row][col] = false;
            }
        }
        return c;
    }

    public static List<String> make(boolean[][] board){
        List<String> ll = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder s = new StringBuilder();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==true){
                    s.append('Q');
                }else{
                    s.append('.');
                }
            }
            ll.add(s.toString());
        }
        return ll;
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]){
                return false;
            }
            r--;
        }
        r = row;
        int c= col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        r = row;
        c= col;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
    
}