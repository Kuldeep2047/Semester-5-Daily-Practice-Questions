// Last updated: 8/9/2025, 1:42:17 PM
class Solution {
    public int kthGrammar(int n, int k) {
        return answer(n,k);
    }
    public static int answer(int n,int k){
        if(n==1 && k==1){
            return 0;
        }
        int len = (int)Math.pow(2,n-1);
        int mid = len/2;
        if(k<=mid){
            return answer(n-1,k);
        }else{
            return 1-answer(n-1,k-mid);
        }

    }
}