// Last updated: 8/9/2025, 1:36:24 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        return answer(grid);
    }
    public static boolean answer(int[][] arr){
        long sum = 0;
        long[] row = new long[arr.length];
        long[] col = new long[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum += arr[i][j];
                row[i] += arr[i][j];
                col[j] += arr[i][j];
            }
        }
        // if(isHorizontal(arr,sum,row) || isVertical(arr,sum,col)){
        //     return true;
        // }
        if(isCut(arr,sum,row) || isCut(arr,sum,col)){
            return true;
        }
        return false;
    }
    public static boolean isCut(int[][] arr,long total,long[] a){
        long sum =0;
        for(int i=0;i<a.length-1;i++){
            sum += a[i];
            if(sum*2 == total){
                return true;
            }
        }
        return false;

    }
    // public static boolean isHorizontal(int[][] arr,long total,long[] a){
    //     long sum =0;
    //     for(int i=0;i<a.length-1;i++){
    //         sum += a[i];
    //         if(sum*2 == total){
    //             return true;
    //         }
    //     }
    //     return false;

    // }
    // public static boolean isVertical(int[][] arr,long total,long[] a){
    //     long sum =0;
    //     for(int i=0;i<a.length-1;i++){
    //         sum += a[i];
    //         if(sum*2 == total){
    //             return true;
    //         }
    //     }
    //     return false;

    // }
}