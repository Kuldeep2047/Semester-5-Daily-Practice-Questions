// Last updated: 8/9/2025, 1:41:34 PM
class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int a = tops[0];
        int b = bottoms[0];
        int val1 = operations(a,tops,bottoms);
        int val2 = operations(b,tops,bottoms);

        if(val1 == -1 && val2 ==-1){
            return -1;
        }else if(val1 == -1){
            return val2;
        }else if(val2 ==-1){
            return val1;
        }else{
            return Math.min(val1,val2);
        }
        
    }
    public static int operations(int a,int[] tops,int[] bottom){
        int n = tops.length;
        int t = 0;  //for top swaps
        int b=0;    //for bottom swaps
        for(int i=0;i<n;i++){
            if(tops[i] != a && bottom[i] != a){
                return -1;
            }else if(tops[i]!=a){
                t++;
            }else if(bottom[i]!=a){
                b++;
            }
        }
        return Math.min(b,t);
    }
}