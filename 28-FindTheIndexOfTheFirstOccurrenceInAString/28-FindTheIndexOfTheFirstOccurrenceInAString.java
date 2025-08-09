// Last updated: 8/9/2025, 1:46:31 PM
class Solution {
    public int strStr(String haystack, String needle) {
        return answer(haystack,needle);
    }
    public static int answer(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        for(int i=0;i<=n-m;i++){
            if(s2.equals(s1.substring(i,i+m))){
                return i;
            }
        }
        return -1;
    }
}