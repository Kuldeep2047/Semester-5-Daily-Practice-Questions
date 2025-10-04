// Last updated: 10/4/2025, 3:39:17 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m= board[0].length;
        for(int i =0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = Word_Search(board, i,j, word, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean Word_Search(char[][] board, int cr ,int cc ,String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || board[cr][cc] != word.charAt(idx)){
            return false;
        }

        board[cr][cc] = '*';
        int[] r = {-1 ,0, 1 ,0};
        int[] c = {0,1,0,-1};
        for(int i=0 ; i<r.length ;i++){
            boolean ans = Word_Search(board, cr+r[i], cc+c[i], word, idx+1);
            if(ans){
                return true;
            }
        }
        
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}