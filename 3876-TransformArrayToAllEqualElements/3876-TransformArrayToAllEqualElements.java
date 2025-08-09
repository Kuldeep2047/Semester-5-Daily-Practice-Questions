// Last updated: 8/9/2025, 1:36:15 PM
class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        return answer(nums,k);
    }
    public static boolean answer(int[] arr,int k){
        int x = opr(arr,1);
        int y = opr(arr,-1);
        return Math.min(x,y) <=k;
    }
    public static int opr(int[] a,int t){
        int n = a.length;
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            if(a[i]==t){
                b[i] =0;
            }else{
                b[i] =1;
            }
        }
        int c=0;
        for(int i=0;i<n-1;i++){
            if(b[i]==1){
                b[i] ^=1;
                b[i+1] ^= 1;
                c++;
            }
        }
        return b[n-1]==0 ? c:Integer.MAX_VALUE;
    }
}