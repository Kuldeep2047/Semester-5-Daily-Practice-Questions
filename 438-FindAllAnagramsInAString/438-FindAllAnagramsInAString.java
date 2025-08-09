// Last updated: 8/9/2025, 1:43:20 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        return anagramsIndex(s,p);
    }

    public static List<Integer> anagramsIndex(String s,String p){
        List<Integer> l = new ArrayList<>();
        int si=0,ei=0;
        int k = p.length();
        int[] scount = new int[26];
        int[] pcount  = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pcount[p.charAt(i) - 'a']++;
        }

        while(ei<s.length()){
            char ch = s.charAt(ei);
            scount[ch-'a']++;

            while(ei-si+1>k && si<ei){
                scount[s.charAt(si)-'a']--;
                si++;
            }

            if(isAnagram(scount,pcount)){
                l.add(si);
            }
            ei++;
        }

        return l;
    }
    public static boolean isAnagram(int[] scount,int[] pcount){
        
        for(int k=0;k<pcount.length;k++){
            if(scount[k]!=pcount[k]){
                return false;
            }
        }
        return true;
    }
}