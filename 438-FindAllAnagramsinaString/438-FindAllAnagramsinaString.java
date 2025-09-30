// Last updated: 9/30/2025, 11:38:34 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        return AnagramIndex(s,p);
    }
    public List<Integer> AnagramIndex(String s ,String p){
        List<Integer> ll = new ArrayList<>();
        int si =0;
        int ei =0;
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(int i=0 ;i<p.length() ;i++){
            pCount[p.charAt(i)-'a']++;
        }
        int k = p.length();
        while(ei<s.length()){
            while(ei-si+1> k){
                if(isAnagram(pCount, sCount)){
                    ll.add(si);
                }
                sCount[s.charAt(si)-'a']--;
                si++;
        
            }
            sCount[s.charAt(ei)-'a']++;
            ei++;
        }
        if(isAnagram(pCount, sCount)){
            ll.add(s.length() - k);
        }
        return ll;
    }
    public static boolean isAnagram(int[] a, int[] b){
        for(int i=0 ;i<a.length ;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    
}