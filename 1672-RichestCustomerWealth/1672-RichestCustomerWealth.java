// Last updated: 9/29/2025, 1:13:48 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        return answer(accounts);
    }
    public int answer(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length ;j++){
                sum += arr[i][j];
            }
            ans = Math.max(ans,sum);
            
        }
        return ans;
    }
}