// Last updated: 8/9/2025, 1:38:20 PM
class Solution {
    public int maxSum(int[][] grid) {
        return answer(grid);
    }
    public static int answer(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}