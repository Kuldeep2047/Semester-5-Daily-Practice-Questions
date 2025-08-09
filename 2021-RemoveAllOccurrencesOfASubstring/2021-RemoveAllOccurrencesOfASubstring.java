// Last updated: 8/9/2025, 1:39:23 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        return Remove_Substring(s,part);
    }
    public static String Remove_Substring(String s, String part){
        int l = part.length();
        int pos = s.indexOf(part);
        while(pos != -1){
            s = s.substring(0,pos)+ s.substring(pos+l);
            pos = s.indexOf(part);
        }
        return s;
    }
}