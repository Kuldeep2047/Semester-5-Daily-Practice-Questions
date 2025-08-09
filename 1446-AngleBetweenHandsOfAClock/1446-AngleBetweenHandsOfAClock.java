// Last updated: 8/9/2025, 1:40:54 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        return answer(hour,minutes);
    }
    public static double answer(int h,int m){
        double angle = (30*h)-(5.5*m);
        angle = Math.abs(angle);
        double sAngle = Math.min(angle,360-angle);
        return sAngle;
    }
}