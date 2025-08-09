// Last updated: 8/9/2025, 1:42:23 PM
class Solution {
    public int reachNumber(int target) {
        return Steps_Number(target);
    }
    public static int Steps_Number(int target){
        target = Math.abs(target);
        int curr=0;
        int step=0;
        while(curr<target || (curr-target)%2 !=0){
            step++;
            curr+=step;
        }
        return step;
    }
}