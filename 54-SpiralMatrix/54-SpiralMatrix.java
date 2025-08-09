// Last updated: 8/9/2025, 1:46:02 PM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
		ArrayList<Integer> l = new ArrayList<>();
		int minr =0, minc=0, maxr = arr.length-1, maxc = arr[0].length-1;
		int te = (maxr+1) * (maxc+1);
		int c=0;
		while(c<te) {
			for(int i=minc ;i<=maxc && c<te; i++) {
				l.add(arr[minr][i]);
				
				c++;
			}
			minr++;
			for(int i=minr; i<=maxr && c<te; i++) {
				l.add(arr[i][maxc]);
				
				c++;
			}
			maxc--;
			for(int i=maxc;i>=minc && c<te;i--) {
				l.add(arr[maxr][i]);
				
				c++;
			}
			maxr--;
			for(int i=maxr;i>=minr && c<te;i--) {
				l.add(arr[i][minc]);
				
				c++;
			}
			minc++;
		}
		return l;
		
		
	}
    
}