// Last updated: 8/9/2025, 1:43:14 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        return answer(points);
    }
    public static int answer(int[][] points){
        Arrays.sort(points,Comparator.comparingInt(arr->arr[1]));
        
        int c=1;
        int pre = points[0][1];
        for(int i=1;i<points.length;i++){
            int ele = points[i][0];
            if(ele>pre){
                c++;
                pre = points[i][1];
            }
            
        }
        return c;

    }
}