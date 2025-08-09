// Last updated: 8/9/2025, 1:37:51 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        return prefix_common_array(A,B);
    }
    public static int[] prefix_common_array(int[] A,int[] B){
        int[] ans = new int[A.length];
        int[] freq = new int[B.length+1];
        
        int c=0;
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                c++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}