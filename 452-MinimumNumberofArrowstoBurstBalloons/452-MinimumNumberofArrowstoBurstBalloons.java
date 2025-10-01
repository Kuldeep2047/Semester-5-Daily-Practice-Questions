// Last updated: 10/1/2025, 9:00:38 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        return minimumArrow(points);
    }
    public static int minimumArrow(int[][] arr){
        Arrays.sort(arr , Comparator.comparingInt(a -> a[1]));
        int arrow =1;
        int first_end = arr[0][1];

        for(int i= 1; i< arr.length ;i++){
            int sec_first = arr[i][0];
            if(first_end < sec_first){
                arrow++;
                first_end = arr[i][1];
            }
        }
        return arrow;
    }
}