// Last updated: 8/9/2025, 1:40:38 PM
class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        return ifBreak(s1,s2);
    }
    public static boolean ifBreak(String s1,String s2){
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(isPossible(a,b) || isPossible(b,a)){
            return true;
        }
        return false;
    }

    public static boolean isPossible(char[] s1,char[] s2){
        for(int i=0;i<s1.length;i++){
            if(s1[i]-'a' > s2[i]-'a'){
                return false;
            }
        }
        return true;
    }
}