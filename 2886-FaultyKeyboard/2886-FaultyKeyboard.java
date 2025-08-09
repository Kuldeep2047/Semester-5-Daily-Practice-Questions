// Last updated: 8/9/2025, 1:37:40 PM
class Solution {
    public String finalString(String s) {
        return answer(s);
    }
    public static String answer(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'i'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}