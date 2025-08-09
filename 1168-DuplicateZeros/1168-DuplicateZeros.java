// Last updated: 8/9/2025, 1:41:27 PM
class Solution {
    public void duplicateZeros(int[] arr) {
        answer(arr);
    }
    public static void answer(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0 && i+1<n){
                for(int j = n-1 ;j>i+1 ;j--){
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}