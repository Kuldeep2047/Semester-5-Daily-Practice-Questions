// Last updated: 8/9/2025, 1:37:36 PM
class Solution {
    public String maximumOddBinaryNumber(String s) {
        return answer(s);
    }
    public static String answer(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int one = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        for(int i=0;i<one-1;i++){
            sb.append("1");
        }
        int zero = n-one;
        for(int i=0;i<zero;i++){
            sb.append("0");

        }
        sb.append("1");
        return sb.toString();
    }
}