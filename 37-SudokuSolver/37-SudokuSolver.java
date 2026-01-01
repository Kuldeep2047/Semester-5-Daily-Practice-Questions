// Last updated: 1/1/2026, 11:52:42 AM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        fill_Suduko(board, 0, 0);
4    }
5
6    public boolean fill_Suduko(char[][] board, int row ,int col){
7        if(col ==9){
8            row++;
9            col =0;
10        }
11        if(row == 9){
12            return true;
13        }
14        if(board[row][col] != '.'){
15            return fill_Suduko(board, row ,col+1);
16        }else{
17            for(int val =1 ;val<=9;val++){
18                if(isitsafe(board, row, col, val)){
19                    board[row][col] = (char)(val+'0');
20                    boolean ans = fill_Suduko(board, row, col+1);
21                    if(ans){
22                        return true;
23                    }
24                    board[row][col] = '.';
25                }
26            }
27        }
28        return false;
29    }
30
31    public boolean isitsafe(char[][] board, int row, int col, int val){
32        //row
33        char ch = (char)(val+'0');
34        for(int i =0 ;i<board.length ;i++){
35            if(board[i][col] == ch){
36                return false;
37            }
38        }
39
40        for(int i =0 ;i<board[0].length ;i++){
41            if(board[row][i] == ch){
42                return false;
43            }
44        }
45
46        int r = row - row%3;
47        int c = col - col%3;
48        for(int i= r ;i< r+3 ;i++){
49            for(int j = c ;j< c+3 ;j++){
50                if(board[i][j] == ch){
51                    return false;
52                }
53            }
54        }
55        return true;
56
57    }
58}