// Last updated: 10/26/2025, 4:20:07 PM
class Solution {
    public long removeZeros(long n) {
        String ans = "";
        while (n > 0) {
            if (n % 10 != 0)
                ans = n % 10 + ans;
            n /= 10;

        }
        return Long.parseLong(ans);
    }
}