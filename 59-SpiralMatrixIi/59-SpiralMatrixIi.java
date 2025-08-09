// Last updated: 8/9/2025, 1:45:57 PM
class Solution {
    public int[][] generateMatrix(int n) {
        return print_spiral(n);
    }
    public static int[][] print_spiral(int n) {
		int val=1;
		int c=0;
		int[][] arr = new int[n][n];
		int minr=0 , minc=0, maxr=n-1,maxc=n-1;
		while(c<n*n) {
			for(int i=minc;i<=maxc && c<n*n;i++) {
				arr[minr][i]=val;
				val++;
				c++;
			}
			minr++;
			for(int i=minr;i<=maxr && c<n*n;i++) {
				arr[i][maxc]=val;
				val++;
				c++;
			}
			maxc--;
			for(int i=maxc;i>=minc && c<n*n;i--) {
				arr[maxr][i]=val;
				val++;
				c++;
			}
			maxr--;
			for(int i=maxr;i>=minr && c<n*n;i--) {
				arr[i][minc]=val;
				val++;
				c++;
			}
			minc++;
		}
        return arr;
		
	}
}