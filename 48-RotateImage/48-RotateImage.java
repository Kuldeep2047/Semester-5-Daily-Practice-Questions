// Last updated: 9/29/2025, 2:02:28 PM
class Solution {
    public void rotate(int[][] matrix) {
        answer(matrix);
    }
    public void answer(int[][] arr){
        int n = arr.length;

        //ab transpose karo
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i<j){
                    int t = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = t;
                }
            }
        }
        //column revrse karo phele
        for(int i = 0 ;i<n;i++){
            int si = 0;
            int ei = n-1;
            while(si<ei){
                int t = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = t;
                si++;
                ei--;

            }
        }

        
     
    }
}