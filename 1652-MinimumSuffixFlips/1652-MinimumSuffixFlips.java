// Last updated: 8/9/2025, 1:40:16 PM
class Solution {
    public int minFlips(String target) {
        return Suffix_Flip(target);
    }
    public static int Suffix_Flip(String target){
        int flip =0;
        char pre = '0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i) != pre){
                flip++;
                pre = target.charAt(i);
            }
        }
        return flip;
    }
}