// Last updated: 1/1/2026, 10:41:57 AM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        char[][] board = new char[n][n];
4        for(char[] arr : board){
5            Arrays.fill(arr, '.');
6        }
7        List<List<String>> res = new ArrayList<>();
8        Place_Queen(board,0,n,res);
9        return res;
10        
11    }
12    public static void Place_Queen(char[][] board, int row, int tq, List<List<String>> res){
13        if(tq == 0){
14            List<String> ll = new ArrayList<>();
15            for(int i= 0; i<board.length ;i++){
16                StringBuilder sb = new StringBuilder();
17                for(int j=0;j<board[0].length ;j++){
18                    char ch = board[i][j];
19                    if(ch != '.'){
20                        sb.append(ch);
21                    }else{
22                        sb.append(ch);
23                    }
24                }
25                ll.add(sb.toString());
26            }
27            res.add(ll);
28            return;
29        }
30        for(int col =0 ;col<board[0].length ;col++){
31            if(isSafe(board, row, col)){
32                board[row][col] = 'Q';
33                Place_Queen(board, row+1, tq-1, res);
34                board[row][col] =  '.';
35            }
36        }
37    }
38
39    public static boolean isSafe(char[][] board, int row, int col){
40        //use cell ke uper check
41        int r= row-1;
42        while(r>=0){
43            if(board[r][col] == 'Q'){
44                return false;
45            }
46            r--;
47        }
48
49        //us cell ke left diagonal per
50        r= row;
51        int c = col;
52        while(r>=0 && c>=0){
53            if(board[r][c] == 'Q'){
54                return false;
55            }
56            r--;
57            c--;
58        } 
59        //us cell ke right diagonal per
60        r = row;
61        c = col;
62        while(r>=0 && c<board[0].length){
63            if(board[r][c] == 'Q'){
64                return false;
65            }
66            r--;
67            c++;
68        }
69        return true;
70        
71    }
72}