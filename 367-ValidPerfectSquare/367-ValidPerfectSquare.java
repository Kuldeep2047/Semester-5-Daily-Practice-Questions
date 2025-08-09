// Last updated: 8/9/2025, 1:43:45 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==4||num==9||num==16||num==25||num==36||num==49) {
            return true;
        }
        int[] validsquare=new int[(int) Math.sqrt(num)];
        for(int i=0;i<validsquare.length;i++){
            validsquare[i]=i+1;
        }
        int lo=0;
        int hi=validsquare.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int e=validsquare[mid]*validsquare[mid];
            if(e==num){
                return true;
            }
            else if(e<num){
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return false;
    }
}