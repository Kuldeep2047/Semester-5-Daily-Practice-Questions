// Last updated: 8/9/2025, 1:38:08 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,Comparator.comparingInt((int[] arr) -> arr[k]).reversed());
        return score;
    }
}