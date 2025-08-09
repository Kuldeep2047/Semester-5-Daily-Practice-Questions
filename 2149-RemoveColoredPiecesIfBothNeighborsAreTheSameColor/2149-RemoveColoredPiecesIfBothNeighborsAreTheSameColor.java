// Last updated: 8/9/2025, 1:39:16 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        return Winner(colors);
    }
    public static boolean Winner(String colors){
        int alice=0;
        int bob =0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                if(colors.charAt(i)=='A'){
                    alice++;
                }else{
                    bob++;
                }
            }
        }
        if(alice>bob){
            return true;
        }else{
            return false;
        }
    }
}