// Last updated: 8/9/2025, 1:37:18 PM
class Solution {
    public boolean isArraySpecial(int[] arr) {
        int n = arr.length;
        if(n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2 != 0) || (arr[i+1]%2==0 && arr[i]%2 != 0)){
                continue;
            }else{
                return false;
            }
        }
        return true;
        
    }
}