// Last updated: 8/9/2025, 1:44:29 PM
class Solution {
    public String shortestPalindrome(String s) {
        return answer(s);
    }
    public static String answer(String s){
        int n = s.length();
        int i=0;
        for(int j=n-1;j>=0;j--){
            if(s.charAt(i) == s.charAt(j)){
                i++;
            }
        }
        if(i==n){
            return s;
        }

        // StringBuilder last = new StringBuilder(s.substring(i,n)).reverse().toString();
        StringBuilder start = new StringBuilder(s.substring(i,n));
        start.reverse().toString();

        // String mid = s.substring(0,i);

        return start + answer(s.substring(0,i))+s.substring(i);
    }
}