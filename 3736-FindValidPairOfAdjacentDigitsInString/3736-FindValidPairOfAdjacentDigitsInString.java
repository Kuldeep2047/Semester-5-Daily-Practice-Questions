// Last updated: 8/9/2025, 1:36:55 PM
class Solution {
    public String findValidPair(String s) {
        return Valid_Pairs(s);
    }
    public static String Valid_Pairs(String s){
        int[] arr = new int[10];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            int a = s.charAt(i)-'0';
            int b = s.charAt(i+1)-'0';
            if(a!=b && arr[a]==a && arr[b]==b){
                return ""+a+b;
            }
        }
        return "";
    }
}