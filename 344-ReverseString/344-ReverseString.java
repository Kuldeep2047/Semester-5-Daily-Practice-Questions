// Last updated: 10/3/2025, 12:01:28 PM
class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    public static void reverse(char[] s, int i, int j) {
        if (i >= j) return;  // base case

        char t = s[i];
        s[i] = s[j];
        s[j] = t;

        reverse(s, i + 1, j - 1);
    }
}