// Last updated: 8/9/2025, 1:41:24 PM
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        return answer(mat,k);
    }
    public static int[][] answer(int[][] arr,int k){
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int r0 = i-k;
                int r1 = i+k;
                int c0 = j-k;
                int c1 = j+k;
                int sum =0;
                for(int r= r0 ;r<=r1 ;r++){
                    if(r>=0 && r<n){
                        for(int c= c0;c<=c1;c++){
                            if(c>=0 && c<m){
                                sum += arr[r][c];
                                                            
                            }
                        }
                    }
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}