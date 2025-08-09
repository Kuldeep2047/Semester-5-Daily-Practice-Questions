// Last updated: 8/9/2025, 1:37:48 PM
class Solution {
    public String removeTrailingZeros(String num) {
        return answer(num);
    }
    public static String answer(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length()-1;
        while(i>=0){
            char ch = sb.charAt(i);
            if(ch == '0'){
                sb.deleteCharAt(i);
                i--;
            }else{
                break;
            }
        }
        return sb.toString();
    }
}