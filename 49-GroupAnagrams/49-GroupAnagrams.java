// Last updated: 8/9/2025, 1:46:10 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Group_Anagram(strs);
    }
    public static List<List<String>> Group_Anagram(String[] strs){
        List<List<String>> ans = new ArrayList<>();
        boolean[] visit = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visit[i]==true){
                continue;
            }
            visit[i] = true;
            List<String> ll = new ArrayList<>();
            ll.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(visit[j]==false && isAnagram(strs[i],strs[j])){
                    ll.add(strs[j]);
                    visit[j] = true;
                }
            }
            ans.add(ll);
        } 
        return ans;
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}