// Last updated: 10/1/2025, 11:03:23 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        return Burst_Balloons(points);
    }
    public int Burst_Balloons(int[][] arr){
        Arrays.sort(arr , Comparator.comparingInt(a ->a[1]));

        int c =1 ;
        int first_end = arr[0][1];
        for(int i=1;i<arr.length ;i++){
            int second_start = arr[i][0];
            if(second_start > first_end){
                c++;

                first_end = arr[i][1];
            }
            
        } 
        return c;
    }
}