// Last updated: 10/4/2025, 9:11:05 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] arr : board){
            Arrays.fill(arr, '.');
        }
        List<List<String>> res = new ArrayList<>();
        Place_Queen(board,0,n,res);
        return res;
        
    }
    public static void Place_Queen(char[][] board, int row, int tq, List<List<String>> res){
        if(tq == 0){
            List<String> ll = new ArrayList<>();
            for(int i= 0; i<board.length ;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<board[0].length ;j++){
                    char ch = board[i][j];
                    if(ch != '.'){
                        sb.append(ch);
                    }else{
                        sb.append(ch);
                    }
                }
                ll.add(sb.toString());
            }
            res.add(ll);
            return;
        }
        for(int col =0 ;col<board[0].length ;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                Place_Queen(board, row+1, tq-1, res);
                board[row][col] =  '.';
            }
        }
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