// Last updated: 8/9/2025, 1:41:08 PM
class Solution {
    public int minimumSwap(String s1, String s2) {
        return min_swap(s1,s2);
    }
    public static int min_swap(String s1,String s2){
        int xy=0;
        int yx=0;
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1=='x' && c2=='y'){
                xy++;
            }
            if(c1=='y' && c2=='x'){
                yx++;
            }
            
        }
        if( (xy+yx)%2 ==1){
                return -1;
        }
        int swap = xy/2 + yx/2;
        if(xy%2==0){
            return swap;
        }else{
            return swap + 2;
        }
    }
}