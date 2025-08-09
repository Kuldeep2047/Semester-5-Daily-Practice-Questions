// Last updated: 8/9/2025, 1:45:23 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return Triangle(triangle,0,0,memo);
    }

    public static int Triangle(List<List<Integer>> triangle,int row ,int col,int[][] memo){
        if(row == triangle.size()-1){
            return triangle.get(row).get(col);
        }

        if (memo[row][col] != -1) {
                return memo[row][col];
            }

        int left = Triangle(triangle,row+1,col,memo);
        int right = Triangle(triangle,row+1,col+1,memo);

        memo[row][col]= triangle.get(row).get(col)+ Math.min(left,right);

        return memo[row][col];
    }
}