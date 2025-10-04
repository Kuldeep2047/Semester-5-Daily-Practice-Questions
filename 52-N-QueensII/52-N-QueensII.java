// Last updated: 10/4/2025, 9:15:04 PM
class Solution {
    public int totalNQueens(int n) {
        // List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        
        
        return Place_Queen(board, 0, n);
        
    }
    
    public static int Place_Queen(char[][] board, int row, int tq){
        if(tq == 0){
            
            return 1;
        }
        int c=0;

        for(int col =0 ;col<board[0].length ;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                c += Place_Queen(board, row+1, tq-1);
                board[row][col] =  '.';
            }
        }
        return c;
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //use cell ke uper check
        int r= row-1;
        while(r>=0){
            if(board[r][col] == 'Q'){
                return false;
            }
            r--;
        }

        //us cell ke left diagonal per
        r= row;
        int c = col;
        while(r>=0 && c>=0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        } 
        //us cell ke right diagonal per
        r = row;
        c = col;
        while(r>=0 && c<board[0].length){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
        
    }
    
}