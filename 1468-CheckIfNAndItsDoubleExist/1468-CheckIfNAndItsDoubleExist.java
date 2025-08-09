// Last updated: 8/9/2025, 1:40:50 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (i!=j && arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}