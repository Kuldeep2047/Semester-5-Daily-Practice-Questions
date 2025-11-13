// Last updated: 11/13/2025, 9:42:55 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        return answer(s, t);
    }

    public static boolean answer(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();

        for(int i=0 ;i<s.length() ;i++){
            char ch = s.charAt(i);
            char th = t.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch) != th){
                    return false;
                }
            }
            else{
                if(map.containsValue(th)){
                    return false;
                }
                map.put(ch, th);
            }

        }
        return true;
    }
}