// Last updated: 8/9/2025, 1:38:21 PM
class Solution {
    public int partitionString(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int c=1;
        Set<Character> set = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                c++;
                set.clear();
            }
            set.add(ch);
            
        }
        return c;
    }
}