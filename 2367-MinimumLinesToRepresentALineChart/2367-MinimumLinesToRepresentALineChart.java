// Last updated: 8/9/2025, 1:38:42 PM
class Solution {
    public int minimumLines(int[][] stockPrices) {
        return lines(stockPrices);
    }
    public static int lines(int[][] arr){
        if(arr.length<=1){
            return 0;
        }
        int c =1;
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        
        // int s1 = dy/dx;
        for(int i=1;i<arr.length-1;i++){
            int dy1 = arr[i][1]- arr[i-1][1];
            int dx1 = arr[i][0] - arr[i-1][0];
            int dy2 = arr[i+1][1]- arr[i][1];
            int dx2 = arr[i+1][0] - arr[i][0];
            // int s2 = dy/dx;
            if((dy1*dx2) != (dy2*dx1)){
                c++;
            }
            
        }
        return c;
        
    }
}