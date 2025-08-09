// Last updated: 8/9/2025, 1:37:39 PM
class Solution {
    public boolean checkStrings(String s1, String s2) {
        return isEqual(s1,s2);
    }
    public static boolean isEqual(String s1,String s2){
        int[] evens1 = new int[26];
        int[] evens2 = new int[26];
        int[] odds1 = new int[26];
        int[] odds2 = new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                evens1[s1.charAt(i)-'a']++;
                evens2[s2.charAt(i)-'a']++;
            }else{
                odds1[s1.charAt(i)-'a']++;
                odds2[s2.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(evens1[i] != evens2[i]){
                return false;
            }
        }

        for(int i=0;i<26;i++){
            if(odds1[i] != odds2[i]){
                return false;
            }
        }
        return true;
    }
}