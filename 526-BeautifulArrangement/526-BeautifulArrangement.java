// Last updated: 10/7/2025, 10:06:08 PM
class Solution {
    int ans = 0;
    public int countArrangement(int n) {
        if (n == 0) return 0;
        backtrack(1, n, new int[n+1]);
        return ans;
    }

    private void backtrack(int idx, int n, int[] usedValueArr) {
        if (idx > n) {
            ans++;

            return;
        }
        for (int i = 1; i <= n; i++) {

            if (usedValueArr[i] == 0 && (idx % i == 0 || i % idx == 0)) {
                usedValueArr[i] = 1;
                backtrack(idx+1, n, usedValueArr);
                usedValueArr[i] = 0;
            }
            
        }
    }
}