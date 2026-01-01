// Last updated: 1/1/2026, 11:31:04 AM
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
19                    sb.append(ch);
20                    
21                }
22                ll.add(sb.toString());
23            }
24            res.add(ll);
25            return;
26        }
27        for(int col =0 ;col<board[0].length ;col++){
28            if(isSafe(board, row, col)){
29                board[row][col] = 'Q';
30                Place_Queen(board, row+1, tq-1, res);
31                board[row][col] =  '.';
32            }
33        }
34    }
35
36    public static boolean isSafe(char[][] board, int row, int col){
37        //use cell ke uper check
38        int r= row-1;
39        while(r>=0){
40            if(board[r][col] == 'Q'){
41                return false;
42            }
43            r--;
44        }
45
46        //us cell ke left diagonal per
47        r= row-1;
48        int c = col-1;
49        while(r>=0 && c>=0){
50            if(board[r][c] == 'Q'){
51                return false;
52            }
53            r--;
54            c--;
55        }
56
57        //us cell ke right diagonal per
58        r = row -1 ;
59        c = col +1;
60        while(r>=0 && c<board[0].length){
61            if(board[r][c] == 'Q'){
62                return false;
63            }
64            r--;
65            c++;
66        }
67        return true;
68        
69    }
70}