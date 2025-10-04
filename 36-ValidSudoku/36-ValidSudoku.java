// Last updated: 10/4/2025, 3:15:42 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0 ;i<board.length ;i++){
            for(int  j=0 ;j<board[0].length ;j++){
                if(board[i][j] == '.'){
                    continue;
                }if(! isitsafe(board, i, j, board[i][j]))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isitsafe(char[][] grid,int row,int col,char val) {
			//row
			for(int i=0;i<9;i++) {
				if(grid[row][i]==val && i!= col) {
					return false;
				}
			}
			//col
			for(int i=0;i<9;i++) {
				if(grid[i][col]==val && i!=row) {
					return false;
				}
			}
			// 3x3 Matrix
			int r = row-row % 3;
			int c = col-col % 3;
			for(int i=r;i<r+3;i++) {
				for(int j=c;j<c+3;j++) {
					if(grid[i][j]==val && (i != row || j != col)) {
						return false;
					}
				}
			}
			return true;
			
		}
}