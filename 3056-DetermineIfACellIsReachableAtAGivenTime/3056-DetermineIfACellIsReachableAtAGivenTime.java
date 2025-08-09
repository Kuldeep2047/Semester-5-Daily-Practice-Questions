// Last updated: 8/9/2025, 1:37:35 PM
class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        return isReachable(sx,sy,fx,fy,t);
    }
    public static boolean isReachable(int sx,int sy,int fx,int fy,int t){
        int dis = Math.max(Math.abs(fx-sx), Math.abs(sy-fy));
        if(dis==0 && t==1){
            return false;
        }
        if(dis<=t){
            return true;
        }else{
            return false;
        }
    }
}