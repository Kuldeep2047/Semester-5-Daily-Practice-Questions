// Last updated: 8/9/2025, 1:37:20 PM
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        return answer(skills,k);
    }
    public static int answer(int[] arr,int k){
        int idx =0;
        int n = arr.length;
        int winner = arr[0];
        int c = 0;
        if(k<n){
            for (int i = 1; i < n; i++) {
            if (winner > arr[i]) {
                c++;
            } else {
                winner = arr[i];
                idx = i;
                c = 1;
            }

            if (c == k) {
                return idx;
            }
        }
        }else{
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(arr[j]>max){
                    max = arr[j];
                    idx =j;
                }
            }
            
        }
        return idx;
    }
}