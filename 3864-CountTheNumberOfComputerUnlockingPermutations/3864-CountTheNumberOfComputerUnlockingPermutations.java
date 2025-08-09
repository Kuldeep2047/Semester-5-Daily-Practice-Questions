// Last updated: 8/9/2025, 1:36:21 PM
class Solution {
    public int countPermutations(int[] complexity) {
        return answer(complexity);
    }
    public static int answer(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[0]){
                return 0;
            }
        }
        int mod = 1000000007;
        long c=1;
        for(int i=2;i<n;i++){
            c = (c*i)%mod;
        }
        return (int)c;
    }
}