// Last updated: 8/9/2025, 1:42:39 PM
class Solution {
    public int findLongestChain(int[][] pairs) {
        return Longest_chain(pairs);
    }
    public static int Longest_chain(int[][] arr){
        int n = arr.length;
        // int c =1;
        int ans = 0;
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        int last = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i][0]>last){
                ans++;
                last = arr[i][1];
            }
        }
        return ans;
    }
}