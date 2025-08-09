// Last updated: 8/9/2025, 1:42:15 PM
class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        return answer(sx,sy,tx,ty);
    }
    public static boolean answer(int sx,int sy,int tx,int ty){
        if(sx==tx && sy==ty){
            return true;
        }
        while(tx>sx && ty>sy){
            if(ty>tx){
                ty = ty%tx;
            }else{
                tx = tx%ty;
            }
            
        }
        if(sx==tx && ty>=sy){
            return (ty-sy)%sx==0;
        }
        else if(sy==ty && tx>=sx){
            return (tx-sx)%ty==0;
        }
        return false;
    }
}